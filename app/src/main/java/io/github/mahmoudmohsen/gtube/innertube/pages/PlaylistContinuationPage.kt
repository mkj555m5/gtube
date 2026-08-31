package io.github.mahmoudmohsen.gtube.innertube.pages

import io.github.mahmoudmohsen.gtube.innertube.models.SongItem

data class PlaylistContinuationPage(
    val songs: List<SongItem>,
    val continuation: String?,
)
