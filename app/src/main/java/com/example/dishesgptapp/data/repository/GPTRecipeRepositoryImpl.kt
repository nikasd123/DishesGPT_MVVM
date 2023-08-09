package com.example.dishesgptapp.data.repository

import com.example.dishesgptapp.data.remote.dto.GPTRecipeChoice
import com.example.dishesgptapp.data.repository.remote.GPTRecipesRemote
import com.example.dishesgptapp.domain.repository.GptRecipeRepository
import javax.inject.Inject

class GPTRecipeRepositoryImpl @Inject constructor(
    private val gptRecipesRemote: GPTRecipesRemote
): GptRecipeRepository{
    override suspend fun getGPTRecipes(prompt: String): List<GPTRecipeChoice> =
        gptRecipesRemote.getGPTRecipes(prompt)?.choices.orEmpty()
}