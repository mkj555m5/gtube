package io.github.mahmoudmohsen.gtube.innertube.models.body

import io.github.mahmoudmohsen.gtube.innertube.models.Context
import kotlinx.serialization.Serializable

@Serializable
data class FeedbackBody(
    val context: Context,
    val feedbackTokens: List<String>,
    val isFeedbackTokenUnencrypted: Boolean = false,
    val shouldMerge: Boolean = false,
)
