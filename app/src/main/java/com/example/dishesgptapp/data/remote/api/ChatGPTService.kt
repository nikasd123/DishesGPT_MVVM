package com.example.dishesgptapp.data.remote.api

import com.example.dishesgptapp.data.remote.dto.RecipeRequestBody
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface ChatGPTService {

    companion object{
        const val
    }

    @POST("chatGPT/generate")
    suspend fun generateRecipe(
        @Header("Authorization") apiKey: String,
        @Body requestBody: RecipeRequestBody
    ): RecipeResponseBody
}

data class RecipeResponseBody(
    val recipe: String
)
