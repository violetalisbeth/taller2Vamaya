package com.pdmtaller2_00007515_VioletaAmaya.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun BottomNavigationBar(navController: NavController) {
    val pistachioColor = Color(0xFF98FF98)

    Surface(
        color = pistachioColor,
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = { /* TODO */ },
                colors = ButtonDefaults.buttonColors(containerColor = pistachioColor),
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 4.dp)
                    .height(50.dp)
            ) {
                Text("Listado", fontWeight = FontWeight.Bold, fontSize = 16.sp, color = Color.Black)
            }

            Button(
                onClick = { /* TODO */ },
                colors = ButtonDefaults.buttonColors(containerColor = pistachioColor),
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 4.dp)
                    .height(50.dp)
            ) {
                Text("Buscar", fontWeight = FontWeight.Bold, fontSize = 16.sp, color = Color.Black)
            }

            Button(
                onClick = { /* TODO */ },
                colors = ButtonDefaults.buttonColors(containerColor = pistachioColor),
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 4.dp)
                    .height(50.dp)
            ) {
                Text("Mis Órdenes", fontWeight = FontWeight.Bold, fontSize = 16.sp, color = Color.Black)
            }
        }
    }
}
