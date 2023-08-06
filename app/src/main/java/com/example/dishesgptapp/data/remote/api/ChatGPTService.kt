package com.example.dishesgptapp.data.remote.api

import com.example.dishesgptapp.BuildConfig
import com.example.dishesgptapp.data.remote.dto.RecipeRequestBody
import com.example.dishesgptapp.data.remote.dto.RecipeResponseBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface ChatGPTService {

    companion object{
        const val API_KEY_PARAM = "Authorization"
        const val API_KEY = BuildConfig.API_KEY
        const val CONTENT_TYPE = "application/json"
    }

    @Headers("Content-Type: $CONTENT_TYPE, $API_KEY_PARAM: $API_KEY")
    @POST("completions")
    suspend fun generateRecipe(
        @Body requestBody: RecipeRequestBody
    ): Call<RecipeResponseBody>
}
