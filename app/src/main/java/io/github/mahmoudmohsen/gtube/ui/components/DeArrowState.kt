package io.github.mahmoudmohsen.gtube.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.runtime.produceState
import io.github.mahmoudmohsen.gtube.data.model.DeArrowResult
import io.github.mahmoudmohsen.gtube.data.repository.DeArrowRepository

@Composable
internal fun rememberDeArrowResult(videoId: String, enabled: Boolean): DeArrowResult? =
    key(videoId, enabled) {
        produceState<DeArrowResult?>(
            initialValue = if (enabled) {
                DeArrowRepository.getCachedDeArrowResult(videoId)
            } else {
                null
            },
            key1 = videoId,
            key2 = enabled,
        ) {
            value = if (enabled) DeArrowRepository.getDeArrowResult(videoId) else null
        }.value
    }
