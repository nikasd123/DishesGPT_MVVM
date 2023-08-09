package com.example.dishesgptapp.domain.repository

import com.example.dishesgptapp.data.remote.dto.GPTRecipeChoice

interface GptRecipeRepository {
    suspend fun getGPTRecipes(prompt: String): List<GPTRecipeChoice>?
}