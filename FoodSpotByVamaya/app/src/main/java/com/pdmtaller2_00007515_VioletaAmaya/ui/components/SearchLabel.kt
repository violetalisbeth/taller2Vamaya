package com.pdmtaller2_00007515_VioletaAmaya.ui.Components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun search(
    searchQuery: String,
    onQueryChange: (String) -> Unit
) {
    TextField(
        value = searchQuery,
        onValueChange = onQueryChange,
        label = { Text("Buscar") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    )
}
