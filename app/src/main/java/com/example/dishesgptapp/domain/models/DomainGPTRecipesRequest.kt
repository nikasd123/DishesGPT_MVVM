package com.example.dishesgptapp.domain.models

data class DomainGPTRecipesRequest(
    val prompt: String? = "",
    val model: Int? = 0,
    val temperature: Double? = 0.0,
    val maxTokens: Int = 0,
)