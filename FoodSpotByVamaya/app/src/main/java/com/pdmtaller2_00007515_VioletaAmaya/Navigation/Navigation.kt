package com.pdmtaller2_00007515_VioletaAmaya.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import androidx.navigation.compose.rememberNavController
import com.pdmtaller2_00007515_VioletaAmaya.ui.screens.CartScreen
import com.pdmtaller2_00007515_VioletaAmaya.ui.screens.CategoryScreen
import com.pdmtaller2_00007515_VioletaAmaya.ui.screens.RestaurantScreen
import com.pdmtaller2_00007515_VioletaAmaya.ui.screens.SearchAll
import com.pdmtaller2_00007515_VioletaAmaya.ui.viewmodel.RestaurantViewModel

@Composable
fun Navigate() {
    val navController = rememberNavController()
    val restaurantViewModel: RestaurantViewModel = RestaurantViewModel()
    NavHost(navController = navController, startDestination = "categories") {
        composable("categories") {
            CategoryScreen(navController, RestaurantViewModel())
        }
        composable("restaurant/{restaurantId}") { backStackEntry ->
            val restaurantId = backStackEntry.arguments?.getString("restaurantId")?.toInt() ?: 0
            RestaurantScreen(
                navController,
                restaurantId,
                restaurantViewModel
            )
        }
        composable("myorders"){
            CartScreen(restaurantViewModel, navController)
        }
        composable("searchall") {
            SearchAll(navController)
        }
    }
}
