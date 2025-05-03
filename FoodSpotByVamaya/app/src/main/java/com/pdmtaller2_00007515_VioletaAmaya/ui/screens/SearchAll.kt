@file:OptIn(ExperimentalMaterial3Api::class)

package com.pdmtaller2_00007515_VioletaAmaya.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.lifecycle.viewmodel.compose.viewModel
import com.pdmtaller2_00007515_VioletaAmaya.viewmodel.RestaurantViewModel

@Composable
fun SearchAll(navController: NavController, restaurantViewModel: RestaurantViewModel = viewModel()) {
    val restaurantsByCategory = restaurantViewModel.restaurantsByCategory.collectAsState()
    val allRestaurants = restaurantsByCategory.value.values.flatten().distinctBy { it.id }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Todos los Restaurantes") }
            )
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
        ) {
            items(allRestaurants) { restaurant ->
                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth()
                        .clickable {
                            navController.navigate("restaurant/${restaurant.id}")
                        }
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(restaurant.name, style = MaterialTheme.typography.titleMedium)
                        Text(restaurant.description, style = MaterialTheme.typography.bodySmall)
                    }
                }
            }
        }
    }
}
