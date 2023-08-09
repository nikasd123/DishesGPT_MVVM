package com.example.dishesgptapp.di.module.repositories

import com.example.dishesgptapp.data.remote.api.ChatGPTApi
import com.example.dishesgptapp.data.repository.remote.GPTRecipesRemote
import com.example.dishesgptapp.data.repository.remote.GPTRecipesRemoteImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class GptRemoteRepositoryModule {

    @Provides
    fun provideGPTRecipesRemote(chatGPTApi: ChatGPTApi): GPTRecipesRemote =
        GPTRecipesRemoteImpl(chatGptApi = chatGPTApi)
}