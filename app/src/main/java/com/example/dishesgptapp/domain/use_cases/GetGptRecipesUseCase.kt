package com.example.dishesgptapp.domain.use_cases

import com.example.dishesgptapp.data.remote.dto.toDomainGPTRecipeChoice
import com.example.dishesgptapp.domain.models.DomainGPTRecipeChoice
import com.example.dishesgptapp.domain.repository.GptRecipeRepository
import javax.inject.Inject

class GetGptRecipesUseCase @Inject constructor(
    private val gptRecipeRepository: GptRecipeRepository
) {
    suspend fun getRecipes(prompt: String): List<DomainGPTRecipeChoice>? =
        gptRecipeRepository.getGPTRecipes(prompt)?.map {
            it.toDomainGPTRecipeChoice()
        }
}