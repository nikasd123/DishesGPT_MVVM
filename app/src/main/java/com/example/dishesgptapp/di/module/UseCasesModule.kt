package com.example.dishesgptapp.di.module

import com.example.dishesgptapp.domain.repository.GptRecipeRepository
import com.example.dishesgptapp.domain.use_cases.GetGptRecipesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class UseCasesModule {

    @Provides
    fun provideGptRecipesUseCase(gptRecipeRepository: GptRecipeRepository) =
        GetGptRecipesUseCase(gptRecipeRepository = gptRecipeRepository)
}