package com.pdmtaller2_00007515_VioletaAmaya.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.pdmtaller2_00007515_VioletaAmaya.Navigation.Screen
import com.pdmtaller2_00007515_VioletaAmaya.ui.components.BottomNavigationBar
import com.pdmtaller2_00007515_VioletaAmaya.viewmodel.RestaurantViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoryScreen(navController: NavHostController, viewModel: RestaurantViewModel) {
    val categoriesMap = viewModel.restaurantsByCategory.collectAsState().value

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "FoodSpot",
                        style = MaterialTheme.typography.titleLarge.copy(
                            fontFamily = FontFamily.SansSerif,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF571E0D)
                        )
                    )
                }
            )
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                LazyColumn(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ) {
                    categoriesMap.forEach { (category, restaurants) ->
                        item {
                            Text(
                                text = category,
                                modifier = Modifier.padding(vertical = 8.dp),
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Medium,
                                color = Color(0xFF812B12)
                            )
                        }

                        item {
                            LazyRow(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(8.dp)
                                    .clip(RoundedCornerShape(25.dp))
                                    .background(Color(0xFFE1DFDF)),
                                horizontalArrangement = Arrangement.Center
                            ) {
                                items(restaurants) { restaurant ->
                                    Card(
                                        modifier = Modifier
                                            .padding(10.dp)
                                            .clickable {
                                                navController.navigate(
                                                    Screen.Restaurant.createRoute(restaurant.id)
                                                )
                                            },
                                        colors = CardDefaults.cardColors(containerColor = Color(0xFFF5C9B9))
                                    ) {
                                        Column(
                                            modifier = Modifier
                                                .padding(8.dp)
                                                .fillMaxWidth(),
                                            horizontalAlignment = Alignment.CenterHorizontally
                                        ) {
                                            Image(
                                                painter = painterResource(id = restaurant.imageUrl),
                                                contentDescription = "Imagen del Restaurante",
                                                modifier = Modifier
                                                    .size(100.dp)
                                                    .padding(bottom = 8.dp),
                                                contentScale = ContentScale.Fit
                                            )
                                            Text(
                                                text = restaurant.name,
                                                style = MaterialTheme.typography.bodyLarge,
                                                maxLines = 1,
                                                overflow = TextOverflow.Ellipsis
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        },
        bottomBar = { BottomNavigationBar(navController) }
    )
}
