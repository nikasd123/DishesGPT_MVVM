package com.example.dishesgptapp.data.remote.dto

import com.google.gson.annotations.SerializedName

data class RecipeRequestBody(
    @SerializedName("prompt")
    val prompt: String?,

    @SerializedName("model")
    val model: Int?,

    @SerializedName("temperature")
    val temperature: Double?,

    @SerializedName("max_tokens")
    val maxTokens: Int,
)
