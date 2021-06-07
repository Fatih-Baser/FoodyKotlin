package com.fatihbasertr.foodykotlin.data


import com.fatihbasertr.foodykotlin.data.network.FoodRecipesApi
import com.fatihbasertr.foodykotlin.models.FoodRecipe
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val foodRecipesApi: FoodRecipesApi
) {

    suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipe> {
        return foodRecipesApi.getRecipes(queries)
    }

}