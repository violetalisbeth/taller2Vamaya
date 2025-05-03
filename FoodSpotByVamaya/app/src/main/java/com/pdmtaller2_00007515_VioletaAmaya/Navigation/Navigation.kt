package com.pdmtaller2_00007515_VioletaAmaya.Navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.pdmtaller2_00007515_VioletaAmaya.ui.screens.CartScreen
import com.pdmtaller2_00007515_VioletaAmaya.ui.screens.CategoryScreen
import com.pdmtaller2_00007515_VioletaAmaya.ui.screens.RestaurantScreen
import com.pdmtaller2_00007515_VioletaAmaya.ui.screens.SearchAll
import com.pdmtaller2_00007515_VioletaAmaya.viewmodel.RestaurantViewModel

@Composable
fun Navigate(navController: NavController, modifier: Modifier) {
    val restaurantViewModel: RestaurantViewModel = viewModel()

    NavHost(
        navController = navController as NavHostController,
        startDestination = "categories"
    ) {
        composable("categories") {
            CategoryScreen(navController, restaurantViewModel)
        }
        composable("restaurant/{restaurantId}") { backStackEntry ->
            val restaurantIdString = backStackEntry.arguments?.getString("restaurantId")
            val restaurantId = restaurantIdString?.toIntOrNull()

            if (restaurantId != null) {
                val restaurant = restaurantViewModel.getRestaurantById(restaurantId)
                if (restaurant != null) {
                    RestaurantScreen(navController, restaurantId, restaurantViewModel)
                } else {
                    Text("Restaurante no encontrado")
                }
            } else {
                Text("ID de restaurante no válido")
            }
        }
        composable("myorders") {
            CartScreen(restaurantViewModel, navController)
        }
        composable("searchall") {
            SearchAll(navController)
        }
    }
}

