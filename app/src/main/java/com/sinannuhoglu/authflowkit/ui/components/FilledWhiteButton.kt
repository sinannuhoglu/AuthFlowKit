package com.sinannuhoglu.authflowkit.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun FilledWhiteButton(text: String, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .background(Color.White, shape = RoundedCornerShape(25.dp))
            .clickable { onClick() },
        contentAlignment = Alignment.Center
    ) {
        Text(text = text, color = Color.Black)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewFilledWhiteButton() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF007BFF))
            .padding(16.dp)
    ) {
        FilledWhiteButton(text = "SIGN UP", onClick = {})
    }
}

