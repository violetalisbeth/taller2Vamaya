package com.pdmtaller2_00007515_VioletaAmaya.ui.Components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.TextButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.pdmtaller2_00007515_VioletaAmaya.Navigation.Screen

// Definir el color pistacho
val PistachioGreen = Color(0xFF93C572)

@Composable
fun BottomNavigationBar(navController: NavController) {
    BottomAppBar(
        containerColor = PistachioGreen,
        tonalElevation = 4.dp
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            NavigationButton("Restaurantes") {
                navController.navigate(Screen.Category.route)
            }

            NavigationButton("Buscar") {
                navController.navigate(Screen.searchAll.route)
            }

            NavigationButton("Mis ordenes") {
                navController.navigate(Screen.MyOrder.route)
            }
        }
    }
}

@Composable
fun NavigationButton(text: String, onClick: () -> Unit) {
    TextButton(onClick = onClick) {
        Text(
            text = text,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            color = Color.White // Puedes cambiarlo a Color.Black si no hay buen contraste
        )
    }
}
