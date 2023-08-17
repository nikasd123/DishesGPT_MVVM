package com.example.dishesgptapp.data.repository.remote

import com.example.dishesgptapp.BuildConfig
import com.example.dishesgptapp.data.remote.api.ChatGPTApi
import com.example.dishesgptapp.data.remote.dto.ChatGPTRequest
import com.example.dishesgptapp.data.remote.dto.ChatGPTResponse
import javax.inject.Inject

class GPTRecipesRemoteImpl @Inject constructor(
    private val chatGptApi: ChatGPTApi
): GPTRecipesRemote{
    private val apiKey = "Bearer " + BuildConfig.API_KEY
    override suspend fun getGPTRecipes(prompt: String): ChatGPTResponse =
        chatGptApi.generateRecipe(
            apiKey,
            ChatGPTRequest(
                prompt = prompt,
                model = "text-davinci-003",
                temperature = 0.5,
                maxTokens = 60
            )
        )
}