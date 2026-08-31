package io.github.mahmoudmohsen.gtube.innertube.models.response

import kotlinx.serialization.Serializable

@Serializable
data class EditPlaylistResponse(
    val newHeader: BrowseResponse.Header?,
)
