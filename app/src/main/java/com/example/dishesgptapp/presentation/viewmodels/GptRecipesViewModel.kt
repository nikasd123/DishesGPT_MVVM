package com.example.dishesgptapp.presentation.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dishesgptapp.domain.models.DomainGPTRecipeChoice
import com.example.dishesgptapp.domain.use_cases.GetGptRecipesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GptRecipesViewModel @Inject constructor(
    private val getGptRecipesUseCase: GetGptRecipesUseCase
) : ViewModel() {
    private val _recipes = MutableLiveData<List<DomainGPTRecipeChoice>?>()
    val recipes: LiveData<List<DomainGPTRecipeChoice>?> = _recipes

    fun fetchRecipes(prompt: String) {
        viewModelScope.launch {
            val result = getGptRecipesUseCase.getRecipes(prompt)
            _recipes.postValue(result)
        }
    }
}