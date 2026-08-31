# Building gtube APK

This document explains how to build the gtube APK from source after the package rename
to `io.github.mahmoudmohsen.gtube`.

## Requirements

| Tool | Version |
| --- | --- |
| JDK | 17+ (Temurin 21 recommended) |
| Android SDK | Platforms `android-37`, Build-Tools `37.0.0`, NDK `29.0.14206865`, CMake `3.22.1` |
| Gradle | Use the bundled wrapper (`./gradlew`) — Gradle 9.6.1 |
| Android Gradle Plugin | 9.3.1 (declared via `gradle/libs.versions.toml`) |
| Kotlin | 2.4.10 |
| RAM | **8 GB minimum**, 16 GB recommended |

> The sandboxed builder that produced this archive runs with a 4 GB hard memory cap, which is not enough
> for Hilt + Room KSP + Kotlin compilation of this project (800+ Kotlin files). Build locally on a machine
> with at least 8 GB of free RAM.

## Setup

1. Clone or extract this archive.
2. Create `local.properties` at the project root with your Android SDK path:

   ```properties
   sdk.dir=/path/to/your/Android/Sdk
   ```

   On macOS: `/Users/your-name/Library/Android/sdk`
   On Linux: `$HOME/Android/Sdk`
   On Windows: `C:\Users\your-name\AppData\Local\Android\Sdk`

3. Make sure the SDK components above are installed via Android Studio's SDK Manager or:

   ```bash
   sdkmanager "platform-tools" "platforms;android-37.0" "build-tools;37.0.0" "ndk;29.0.14206865" "cmake;3.22.1"
   ```

4. (Optional) For a signed release build, drop a `release.keystore` at the project root and set
   `storePassword`, `keyAlias`, `keyPassword` either in `local.properties` or as environment
   variables. Debug builds are unsigned-by-default and work without a keystore.

## Build commands

### Debug APK (github flavor — includes Discord presence + auto-updater)

```bash
./gradlew :app:assembleGithubDebug
```

Output: `app/build/outputs/apk/github/debug/app-github-debug.apk`

### Release APK (unsigned if no keystore, signed otherwise)

```bash
./gradlew :app:assembleGithubRelease
```

Output: `app/build/outputs/apk/github/release/app-github-release.apk`

### FOSS flavor (no proprietary components, no auto-updater)

```bash
./gradlew :app:assembleFossRelease
```

Output: `app/build/outputs/apk/foss/release/app-foss-release.apk`

### All variants

```bash
./gradlew assemble
```

## Package identity

| Field | Value |
| --- | --- |
| `applicationId` | `io.github.mahmoudmohsen.gtube` |
| `namespace` (R class package) | `io.github.mahmoudmohsen.gtube` |
| App display name | `gtube` |
| App developer (About screen) | `محمود محسن` |
| Color palette | Gojo Satoru (electric blue `#1E90FF` + dark navy `#0A0E27` + white) |

The full Kotlin source tree, Room schemas directory, AndroidManifest action/receiver names,
and every `package` declaration were migrated from `io.github.aedev.flow` to
`io.github.mahmoudmohsen.gtube`. No stale references remain.

## Troubleshooting

### "Toolchain installation does not provide the required capabilities: [JAVA_COMPILER]"

Your JAVA_HOME points at a JRE-only install. Install a full JDK and set JAVA_HOME accordingly.

### "Not enough memory to run compilation"

Increase the Gradle and Kotlin daemon heaps in `gradle.properties`:

```properties
org.gradle.jvmargs=-Xmx4096m -XX:MaxMetaspaceSize=1024m
kotlin.daemon.jvmargs=-Xmx4096m -XX:MaxMetaspaceSize=1024m
```

### "Failed to find package 'platforms;android-37'"

Open Android Studio → SDK Manager → SDK Platforms tab → tick "Android SDK Platform 37"
(or 37.0 specifically). Apply.

### Building on a low-RAM machine

Edit `app/build.gradle.kts` and set `splits.abi.isEnable = false`, plus reduce `abiFilters`
to a single architecture (`arm64-v8a`). This drops peak memory usage substantially.

## Sign the APK (optional, for installation alongside Play Store apps)

```bash
./gradlew :app:assembleGithubRelease \
  -PstorePassword=yourstorepass \
  -PkeyAlias=yourkey \
  -PkeyPassword=yourkeypass
```

Or place `release.keystore` at project root and put the credentials in `local.properties`:

```properties
storePassword=yourstorepass
keyAlias=yourkey
keyPassword=yourkeypass
```
