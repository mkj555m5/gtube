package io.github.mahmoudmohsen.gtube.discord

import android.content.Context
import io.github.mahmoudmohsen.gtube.BuildConfig
import okhttp3.OkHttpClient

class DiscordPlatformTransportFactory : DiscordPresenceTransportFactory {
    override fun create(
        context: Context,
        okHttpClient: OkHttpClient,
        tokenStore: DiscordTokenStore,
    ): DiscordPresenceTransport = KizzyDiscordPresenceTransport(
        context = context.applicationContext,
        client = okHttpClient,
        tokenStore = tokenStore,
        applicationId = BuildConfig.DISCORD_APPLICATION_ID,
    )
}
