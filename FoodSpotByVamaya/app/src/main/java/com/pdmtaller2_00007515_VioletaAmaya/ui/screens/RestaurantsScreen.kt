package com.pdmtaller2_00007515_VioletaAmaya.ui.screens

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberImagePainter
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberAsyncImagePainter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.pdmtaller2_00007515_VioletaAmaya.data.model.Dish
import com.pdmtaller2_00007515_VioletaAmaya.ui.Components.BottomNavigationBar
import com.pdmtaller2_00007515_VioletaAmaya.ui.Components.DishCard
import com.pdmtaller2_00007515_VioletaAmaya.ui.Components.search
import com.pdmtaller2_00007515_VioletaAmaya.ui.viewmodel.RestaurantViewModel

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun RestaurantScreen(navController: NavController, restaurantId: Int, restaurantViewModel: RestaurantViewModel) {
    val restaurant = restaurantViewModel.getRestaurantById(restaurantId)
    var searchState = remember { mutableStateOf("") }
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            text = restaurant?.name ?: "",
                            style = MaterialTheme.typography.titleLarge.copy(
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight.Bold),
                            color = Color(0xFF571E0D)

                        )
                        Text(
                            text = restaurant?.description ?: "",
                            style = MaterialTheme.typography.bodySmall,
                            maxLines = 1,
                            color = Color(0xFF571E0D)
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "volver",                         tint = Color(0xFF812B12))
                    }
                }
            )
        },
        content = { paddingValues ->
            restaurant?.let { nonNullRestaurant ->
                val filteredDishes = nonNullRestaurant.menu.filter {
                    it.name.contains(searchState.value, ignoreCase = true)
                }

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(paddingValues),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    search(searchState)

                    LazyColumn(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        items(filteredDishes) { dish ->
                            BuyDish(dish, restaurantViewModel)
                        }
                    }
                }
            }

        },
        bottomBar = { BottomNavigationBar(navController)}
    )
}

@Composable
fun BuyDish(dish: Dish, restaurantViewModel: RestaurantViewModel) {
    val context = LocalContext.current

    DishCard(dish, onBuyClick = {
        restaurantViewModel.addToCart(dish)
        Toast.makeText(context, "${dish.name} agregado al carrito", Toast.LENGTH_SHORT).show()

    })
}




@Preview(showBackground = true)
@Composable
fun PreviewRestaurantScreen() {
    val restaurantViewModel = RestaurantViewModel()

    val restaurantId = 2

    RestaurantScreen(
        navController = rememberNavController(),
        restaurantId = restaurantId,
        restaurantViewModel = restaurantViewModel
    )
}