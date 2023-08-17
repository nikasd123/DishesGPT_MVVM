package com.example.dishesgptapp.data.remote.dto

import com.google.gson.annotations.SerializedName

data class ChatGPTRequest(
    @SerializedName("prompt")
    val prompt: String?,

    @SerializedName("model")
    val model: String?,

    @SerializedName("temperature")
    val temperature: Double?,

    @SerializedName("max_tokens")
    val maxTokens: Int?,
)
