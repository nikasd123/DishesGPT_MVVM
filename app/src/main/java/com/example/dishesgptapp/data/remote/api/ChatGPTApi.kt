package com.example.dishesgptapp.data.remote.api

import com.example.dishesgptapp.data.remote.dto.ChatGPTRequest
import com.example.dishesgptapp.data.remote.dto.ChatGPTResponse
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST

interface ChatGPTApi {

    companion object {
        const val API_KEY_PARAM = "Authorization"
        const val CONTENT_TYPE = "application/json"
    }

    @Headers("Content-Type: $CONTENT_TYPE")
    @POST("completions")
    suspend fun generateRecipe(
        @Header(API_KEY_PARAM) apiKey: String,
        @Body requestBody: ChatGPTRequest
    ): ChatGPTResponse
}

