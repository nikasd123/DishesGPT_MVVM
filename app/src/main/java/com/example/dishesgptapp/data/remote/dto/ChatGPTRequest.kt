package com.example.dishesgptapp.data.remote.dto

import com.example.dishesgptapp.domain.models.DomainGPTRecipesRequest
import com.google.gson.annotations.SerializedName

data class ChatGPTRequest(
    @SerializedName("prompt")
    val prompt: String?,

    @SerializedName("model")
    val model: Int?,

    @SerializedName("temperature")
    val temperature: Double?,

    @SerializedName("max_tokens")
    val maxTokens: Int,
)

internal fun ChatGPTRequest.toDomainGPTRecipesRequest(): DomainGPTRecipesRequest =
    DomainGPTRecipesRequest(
        prompt = prompt,
        model = model,
        temperature = temperature,
        maxTokens = maxTokens
    )
