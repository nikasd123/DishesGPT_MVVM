package com.example.dishesgptapp.domain.repository

import com.example.dishesgptapp.data.remote.dto.ChatGPTResponse

interface GptRecipeRepository {
    suspend fun getGPTRecipes(prompt: String): ChatGPTResponse
}