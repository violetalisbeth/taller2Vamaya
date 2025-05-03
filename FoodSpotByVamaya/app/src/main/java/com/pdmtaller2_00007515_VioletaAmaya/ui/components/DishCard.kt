package com.pdmtaller2_00007515_VioletaAmaya.ui.Components

import android.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.pdmtaller2_00007515_VioletaAmaya.data.model.Dish

@Composable
fun DishCard(
    dish: Dish,
    onBuyClick: (() -> Unit)? = null
) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = rememberAsyncImagePainter(dish.imageUrl),
                contentDescription = "Imagen de platillo",
                modifier = Modifier
                    .size(100.dp)
                    .padding(2.dp),
                contentScale = ContentScale.Fit
            )

            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 16.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Text(text = dish.name, modifier = Modifier.padding(bottom = 4.dp),
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Bold),
                    color = Color(0xFF571E0D)

                )
                Text(text = dish.description, color = Color(0xFF812B12))
            }

            if (onBuyClick != null) {
                IconButton (onClick = onBuyClick) {
                    Icon(
                        Icons.Default.ShoppingCart,
                        contentDescription = "Agregar al carrito",
                        tint = Color(0xFF812B12)
                    )
                }
            }
        }
    }
}