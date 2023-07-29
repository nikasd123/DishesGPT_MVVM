package com.example.dishesgptapp.data.remote.dto

data class RecipeRequestBody(
    val prompt: String,
    val length: Int,
    val temperature: Double,
    val topP: Double,
    val topK: Int
)
