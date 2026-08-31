package io.github.mahmoudmohsen.gtube.innertube.models.body

import io.github.mahmoudmohsen.gtube.innertube.models.Context
import io.github.mahmoudmohsen.gtube.innertube.models.Continuation
import kotlinx.serialization.Serializable

@Serializable
data class BrowseBody(
    val context: Context,
    val browseId: String?,
    val params: String?,
    val continuation: String?,
    val query: String? = null,
    val canonicalBaseUrl: String? = null,
)
