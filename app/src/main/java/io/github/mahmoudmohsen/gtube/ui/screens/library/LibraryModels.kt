package io.github.mahmoudmohsen.gtube.ui.screens.library

import io.github.mahmoudmohsen.gtube.data.local.LikedVideoInfo
import io.github.mahmoudmohsen.gtube.data.local.VideoHistoryEntry
import io.github.mahmoudmohsen.gtube.data.music.DownloadedTrack
import io.github.mahmoudmohsen.gtube.data.model.Video
import io.github.mahmoudmohsen.gtube.data.video.DownloadedVideo
import io.github.mahmoudmohsen.gtube.ui.screens.music.MusicTrack

internal const val LIBRARY_SHELF_ITEM_LIMIT = 20

internal sealed interface LibraryMediaItem {
    val key: String

    data class VideoItem(val video: Video) : LibraryMediaItem {
        override val key: String = "video:${video.id}"
    }

    data class MusicItem(val track: MusicTrack) : LibraryMediaItem {
        override val key: String = "music:${track.videoId}"
    }

    data class DownloadedVideoItem(val download: DownloadedVideo) : LibraryMediaItem {
        override val key: String = "downloaded-video:${download.video.id}"
    }

    data class DownloadedMusicItem(val download: DownloadedTrack) : LibraryMediaItem {
        override val key: String = "downloaded-music:${download.track.videoId}"
    }
}

internal fun VideoHistoryEntry.toLibraryMediaItem(): LibraryMediaItem =
    if (isMusic) {
        LibraryMediaItem.MusicItem(
            MusicTrack(
                videoId = videoId,
                title = title,
                artist = channelName,
                thumbnailUrl = thumbnailUrl,
                duration = (duration / 1_000L).toInt(),
                channelId = channelId
            )
        )
    } else {
        LibraryMediaItem.VideoItem(
            Video(
                id = videoId,
                title = title,
                channelName = channelName,
                channelId = channelId,
                thumbnailUrl = thumbnailUrl,
                duration = (duration / 1_000L).toInt(),
                viewCount = -1L,
                uploadDate = "",
                timestamp = timestamp
            )
        )
    }

internal fun LikedVideoInfo.toLibraryMediaItem(): LibraryMediaItem =
    if (isMusic) {
        LibraryMediaItem.MusicItem(
            MusicTrack(
                videoId = videoId,
                title = title,
                artist = channelName,
                thumbnailUrl = thumbnail,
                duration = 0
            )
        )
    } else {
        LibraryMediaItem.VideoItem(
            Video(
                id = videoId,
                title = title,
                channelName = channelName,
                channelId = "",
                thumbnailUrl = thumbnail,
                duration = 0,
                viewCount = -1L,
                uploadDate = "",
                timestamp = likedAt
            )
        )
    }
