package io.github.mahmoudmohsen.gtube.innertube.models.body

import io.github.mahmoudmohsen.gtube.innertube.models.Context
import kotlinx.serialization.Serializable

@Serializable
data class PlaylistDeleteBody(
    val context: Context,
    val playlistId: String
)
