package com.example.dishesgptapp.domain.models

data class DomainGPTRecipeChoice(
    val text: String? = "",
    val index: Int? = 0,
    val logprobs: Any?,
    val finishReason: String? = "",
)