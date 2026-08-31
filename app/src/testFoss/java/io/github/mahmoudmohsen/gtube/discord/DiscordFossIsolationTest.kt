package io.github.mahmoudmohsen.gtube.discord

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class DiscordFossIsolationTest {
    @Test
    fun `foss classpath excludes functional Discord implementation`() {
        val forbiddenClasses = listOf(
            "io.github.mahmoudmohsen.gtube.discord.DiscordTokenStore",
            "io.github.mahmoudmohsen.gtube.discord.DiscordAuthTokens",
            "io.github.mahmoudmohsen.gtube.discord.DiscordPlaybackSource",
            "io.github.mahmoudmohsen.gtube.discord.DiscordPresenceCoordinator",
            "io.github.mahmoudmohsen.gtube.discord.KizzyDiscordPresenceTransport",
            "io.github.mahmoudmohsen.gtube.discord.KizzyGatewayProtocol",
        )

        forbiddenClasses.forEach { className ->
            assertThat(runCatching { Class.forName(className) }.isFailure).isTrue()
        }
    }

    @Test
    fun `foss runtime reports Discord unavailable`() {
        assertThat(DiscordPresenceRuntime.settingsState.value.isAvailable).isFalse()
        assertThat(DiscordPresenceRuntime.settingsState.value.isEnabled).isFalse()
        assertThat(DiscordPresenceRuntime.settingsState.value.summary)
            .isEqualTo(DiscordSettingsSummary.UNAVAILABLE)
    }
}
