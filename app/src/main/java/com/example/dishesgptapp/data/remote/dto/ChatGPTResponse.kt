package com.example.dishesgptapp.data.remote.dto

import com.google.gson.annotations.SerializedName

data class ChatGPTResponse(
    @SerializedName("id")
    val id: String,

    @SerializedName("object")
    val item: String,

    @SerializedName("created")
    val created: Long,

    @SerializedName("model")
    val model: String,

    @SerializedName("choices")
    val choices: List<GPTRecipeChoice>,

    @SerializedName("usage")
    val usage: ChatGptUsage
)
