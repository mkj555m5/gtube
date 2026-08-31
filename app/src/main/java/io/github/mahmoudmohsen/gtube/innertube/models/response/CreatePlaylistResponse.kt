package io.github.mahmoudmohsen.gtube.innertube.models.response

import kotlinx.serialization.Serializable

@Serializable
data class CreatePlaylistResponse(
    val playlistId: String
)
