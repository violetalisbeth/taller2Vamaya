package com.pdmtaller2_00007515_VioletaAmaya.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.pdmtaller2_00007515_VioletaAmaya.ui.components.BottomNavigationBar
import com.pdmtaller2_00007515_VioletaAmaya.ui.components.DishCard
import com.pdmtaller2_00007515_VioletaAmaya.ui.components.search
import com.pdmtaller2_00007515_VioletaAmaya.viewmodel.RestaurantViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CartScreen(viewModel: RestaurantViewModel, navController: NavController) {
    val searchState = remember { mutableStateOf("") }

    val orderHistoryId = viewModel.orderHistory.collectAsState().value
    val orderHistory = orderHistoryId.mapNotNull { id ->
        viewModel.getDishesById(id)
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "Pantalla de ordenes",
                        style = MaterialTheme.typography.titleLarge.copy(
                            fontFamily = FontFamily.SansSerif,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF571E0D)
                        )
                    )
                }
            )
        },
        bottomBar = {
            BottomNavigationBar(navController as NavHostController)
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                val filteredCartItems = orderHistory.filter {
                    it.name.contains(searchState.value, ignoreCase = true)
                }
                LazyColumn(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    items(filteredCartItems) { dish ->
                        DishCard(dish)
                    }
                }
            }
        }
    )
}
