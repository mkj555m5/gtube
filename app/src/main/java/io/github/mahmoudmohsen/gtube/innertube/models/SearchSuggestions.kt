package io.github.mahmoudmohsen.gtube.innertube.models

data class SearchSuggestions(
    val queries: List<String>,
    val recommendedItems: List<YTItem>,
)
