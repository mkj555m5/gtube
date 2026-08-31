package io.github.mahmoudmohsen.gtube.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import io.github.mahmoudmohsen.gtube.data.local.PlayerPreferences
import io.github.mahmoudmohsen.gtube.data.repository.YouTubeRepository
import io.github.mahmoudmohsen.gtube.data.shorts.ChannelReelIndex
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideYouTubeRepository(
        playerPreferences: PlayerPreferences,
        channelReelIndex: ChannelReelIndex,
    ): YouTubeRepository = YouTubeRepository.getInstance(playerPreferences, channelReelIndex)

    @Provides
    @Singleton
    fun provideSubscriptionRepository(
        @ApplicationContext context: Context,
    ): io.github.mahmoudmohsen.gtube.data.local.SubscriptionRepository =
        io.github.mahmoudmohsen.gtube.data.local.SubscriptionRepository
            .getInstance(context)

    @Provides
    @Singleton
    fun provideLikedVideosRepository(
        @ApplicationContext context: Context,
    ): io.github.mahmoudmohsen.gtube.data.local.LikedVideosRepository =
        io.github.mahmoudmohsen.gtube.data.local.LikedVideosRepository
            .getInstance(context)

    @Provides
    @Singleton
    fun provideViewHistory(
        @ApplicationContext context: Context,
    ): io.github.mahmoudmohsen.gtube.data.local.ViewHistory =
        io.github.mahmoudmohsen.gtube.data.local.ViewHistory
            .getInstance(context)

    @Provides
    @Singleton
    fun provideMusicPlaylistRepository(
        @ApplicationContext context: Context,
    ): io.github.mahmoudmohsen.gtube.data.music.PlaylistRepository =
        io.github.mahmoudmohsen.gtube.data.music
            .PlaylistRepository(context)

    // VideoDownloadManager is now @Singleton @Inject — Hilt provides it automatically
    @Provides
    @Singleton
    fun providePlayerPreferences(
        @ApplicationContext context: Context,
    ): io.github.mahmoudmohsen.gtube.data.local.PlayerPreferences =
        io.github.mahmoudmohsen.gtube.data.local
            .PlayerPreferences(context)

    @Provides
    @Singleton
    fun provideShortsRepository(
        @ApplicationContext context: Context,
    ): io.github.mahmoudmohsen.gtube.data.shorts.ShortsRepository =
        io.github.mahmoudmohsen.gtube.data.shorts.ShortsRepository
            .getInstance(context)
}
