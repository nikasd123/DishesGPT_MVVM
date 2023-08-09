package com.example.dishesgptapp.data.remote.dto

import com.google.gson.annotations.SerializedName

data class GPTRecipeChoice(
    @SerializedName("text")
    val text: String?,

    @SerializedName("index")
    val index: Int?,

    @SerializedName("logprobs")
    val logprobs: Any?,

    @SerializedName("finish_reason")
    val finishReason: String?
)
