package com.example.dishesgptapp.presentation.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.dishesgptapp.R
import com.example.dishesgptapp.databinding.FragmentGptRecipesBinding
import com.example.dishesgptapp.domain.models.DomainGPTRecipeChoice
import com.example.dishesgptapp.presentation.viewmodels.GptRecipesViewModel
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

@AndroidEntryPoint
class GptRecipesFragment : Fragment(R.layout.fragment_gpt_recipes) {

    private lateinit var binding: FragmentGptRecipesBinding
    private val viewModel: GptRecipesViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentGptRecipesBinding.bind(view)

        Timber.d("Created")
        generatePrompt()

        viewModel.recipes.observe(viewLifecycleOwner) { recipes ->
            with(binding){
                buttonAdd.setOnClickListener {
                    Timber.d("Clicked")

                    generatePrompt()
                    if (recipes?.isNotEmpty() == true) {
                        val resultText = buildResultText(recipes)
                        result.text = resultText
                    } else {
                        result.text = getString(R.string.null_prompt)
                    }
                }
            }
        }
    }

    private fun generatePrompt() {
        Timber.d("Getting products text: ${binding.products.text}")
        val productsText = binding.products.text.toString()
        Timber.d("Generated prompt with products: $productsText")

        viewModel.fetchRecipes("Сгенерируй блюда на основе этих продуктов: $productsText." +
                "Не пиши ничего лишнего. Твоя задача написать рецепты возможных блюд по такому плану:" +
                "название блюда, сложность, время приготовления и пошаговый рецепт.")
    }


    private fun buildResultText(recipes: List<DomainGPTRecipeChoice>): String {
        val resultStringBuilder = StringBuilder()

        for ((index, recipe) in recipes.withIndex()) {
            //resultStringBuilder.append("Recipe ${index + 1}:\n")
            resultStringBuilder.append("${recipe.text}\n")
            //resultStringBuilder.append("Finish Reason: ${recipe.finishReason}\n")
            //resultStringBuilder.append("------------------------------\n")
        }

        return resultStringBuilder.toString()
    }
}