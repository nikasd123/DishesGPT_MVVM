package com.example.dishesgptapp.data.repository.remote

import com.example.dishesgptapp.data.remote.dto.ChatGPTResponse

interface GPTRecipesRemote {
    suspend fun getGPTRecipes(prompt: String): ChatGPTResponse
}