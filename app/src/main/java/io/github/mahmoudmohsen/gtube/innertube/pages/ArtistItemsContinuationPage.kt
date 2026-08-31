package io.github.mahmoudmohsen.gtube.innertube.pages

import io.github.mahmoudmohsen.gtube.innertube.models.YTItem

data class ArtistItemsContinuationPage(
    val items: List<YTItem>,
    val continuation: String?,
)
