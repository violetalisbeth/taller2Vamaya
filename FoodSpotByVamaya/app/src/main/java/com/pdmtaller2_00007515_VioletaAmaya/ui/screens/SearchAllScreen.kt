package com.pdmtaller2_00007515_VioletaAmaya.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.pdmtaller2_00007515_VioletaAmaya.Navigation.Screen
import com.pdmtaller2_00007515_VioletaAmaya.ui.Components.BottomNavigationBar
import com.pdmtaller2_00007515_VioletaAmaya.ui.Components.search
import com.pdmtaller2_00007515_VioletaAmaya.ui.components.RestaurantCard
import com.pdmtaller2_00007515_VioletaAmaya.ui.viewmodel.RestaurantViewModel

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun SearchAll(navController: NavController, viewModel: RestaurantViewModel){
    var searchState = viewModel.searchState.collectAsState()
    val searchText = searchState.value
    var searchResult = viewModel.advancedSearcher(searchText)

    LaunchedEffect(Unit) {
        viewModel.updateSearchQuery("")
    }


    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Pantalla de búsqueda \uD83D\uDD0E ",
                    style = MaterialTheme.typography.titleLarge.copy(
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF571E0D)
                    ))

                }

            )
        },
        content = {
                paddingValues ->
            Column(modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize(),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                search(searchText){ searchQuery ->
                    viewModel.updateSearchQuery(searchQuery)

                }

                if (searchState.value.isEmpty()){
                    Text(
                        text = "Introduce tu busqueda",
                        color = Color.Gray,
                        style = MaterialTheme.typography.bodyLarge,
                        modifier = Modifier.padding(top = 100.dp)
                    )
                }else{
                    LazyRow(
                        modifier = Modifier
                            .padding(8.dp)
                            .clip(RoundedCornerShape(25.dp))
                            .background(Color(0xFFE1DFDF)),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        items(searchResult) { restaurant ->
                                RestaurantCard(restaurant) {
                                navController.navigate(Screen.Restaurant.createRoute(restaurant.id))
                                viewModel.updateSearchQuery("")
                            }

                        }
                    }
                }

            }
        },
        bottomBar = { BottomNavigationBar(navController)}
    )
}
