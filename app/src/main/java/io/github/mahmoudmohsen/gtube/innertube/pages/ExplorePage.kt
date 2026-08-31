package io.github.mahmoudmohsen.gtube.innertube.pages

import io.github.mahmoudmohsen.gtube.innertube.models.AlbumItem

data class ExplorePage(
    val newReleaseAlbums: List<AlbumItem>,
    val moodAndGenres: List<MoodAndGenres.Item>,
)
