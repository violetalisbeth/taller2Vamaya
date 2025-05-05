package com.pdmtaller2_00007515_VioletaAmaya.ui.viewmodel

import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.pdmtaller2_00007515_VioletaAmaya.data.dummy.allRestaurant
import com.pdmtaller2_00007515_VioletaAmaya.data.model.Dish
import com.pdmtaller2_00007515_VioletaAmaya.data.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class RestaurantViewModel : ViewModel() {
    private val _restaurantsByCategory = MutableStateFlow<Map<String, List<Restaurant>>>(emptyMap())
    val restaurantsByCategory: StateFlow<Map<String, List<Restaurant>>> = _restaurantsByCategory
    private val _allRestaurants = allRestaurant
    private val _orderHistoryId = mutableStateListOf<Int>()
    private val _orderHistoryStateFlow = MutableStateFlow<List<Int>>(emptyList())
    val orderHistory: StateFlow<List<Int>> get() = _orderHistoryStateFlow
    private val _allDishes = allRestaurant.flatMap{it.menu}


    init {
        categorizeRestaurants(_allRestaurants)
    }

    fun categorizeRestaurants(allRestaurant: List<Restaurant>) {
        val categoryMap = mapOf(
            "Comida Rápida" to "comida rápida",
            "Comida Mexicana" to "comida mexicana",
            "Comida Italiana" to "comida italiana",
            "Comida Asiática" to "comida asiática",
            "Comida Saludable" to "comida saludable",
            "Postres y Dulces" to "postres",
            "Bebidas" to "bebidas"
        )

        val restaurantsByCategory = mutableMapOf<String, MutableList<Restaurant>>()
        categoryMap.keys.forEach { category -> restaurantsByCategory[category] = mutableListOf() }

        for (restaurant in allRestaurant) {
            val restaurantCategoriesLower = restaurant.categories.map { it.lowercase() }

            categoryMap.forEach { (category, categoryValue) ->
                if (restaurantCategoriesLower.any { it.contains(categoryValue) }) {
                    restaurantsByCategory[category]?.add(restaurant)
                }
            }
        }

        _restaurantsByCategory.value = restaurantsByCategory
    }

    fun getRestaurantById(restaurantId: Int): Restaurant? {
        return _allRestaurants.find { it.id == restaurantId }
    }

    fun getDishesById(id: Int) :Dish?{
        return _allDishes.find { it.id == id }
    }

    fun addToCart(dish: Dish){
        _orderHistoryId.add(dish.id)
        _orderHistoryStateFlow.value= _orderHistoryId.toList()
    }
    fun searchRestaurants(query: String): List<Restaurant> {
        val normalizedQuery = query.trim().lowercase()

        return _allRestaurants.filter { restaurant ->
            val nameMatches = restaurant.name.lowercase().contains(normalizedQuery)
            val categoryMatches = restaurant.categories.any { it.lowercase().contains(normalizedQuery) }
            val dishMatches = restaurant.menu.any { it.name.lowercase().contains(normalizedQuery) }

            nameMatches || categoryMatches || dishMatches
        }
    }

}