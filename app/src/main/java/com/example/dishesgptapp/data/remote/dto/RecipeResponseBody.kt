package com.example.dishesgptapp.data.remote.dto

import com.google.gson.annotations.SerializedName

data class RecipeResponseBody(
    @SerializedName("id")
    val id: String,

    @SerializedName("object")
    val `object`: String,

    @SerializedName("created")
    val created: Long,

    @SerializedName("model")
    val model: String,

    @SerializedName("choices")
    val choices: List<RecipeChoice>,

    @SerializedName("usage")
    val usage: ChatGptUsage
)
