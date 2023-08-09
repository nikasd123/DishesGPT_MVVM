package com.example.dishesgptapp.di.module.repositories

import com.example.dishesgptapp.data.repository.GPTRecipeRepositoryImpl
import com.example.dishesgptapp.data.repository.remote.GPTRecipesRemote
import com.example.dishesgptapp.domain.repository.GptRecipeRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    fun provideGptRecipeRepository(gptRecipesRemote: GPTRecipesRemote): GptRecipeRepository =
        GPTRecipeRepositoryImpl(gptRecipesRemote = gptRecipesRemote)
}