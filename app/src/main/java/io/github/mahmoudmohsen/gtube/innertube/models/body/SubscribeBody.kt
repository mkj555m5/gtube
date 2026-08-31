package io.github.mahmoudmohsen.gtube.innertube.models.body

import io.github.mahmoudmohsen.gtube.innertube.models.Context
import kotlinx.serialization.Serializable

@Serializable
data class SubscribeBody(
    val channelIds: List<String>,
    val context: Context,
)
