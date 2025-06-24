package com.sinannuhoglu.authflowkit.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun TitleSection(
    title: String, subtitle: String
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 32.dp, end = 32.dp, top = 48.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = title, fontSize = 40.sp, fontWeight = FontWeight.Bold, color = Color.White
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = subtitle, fontSize = 20.sp, color = Color.White
        )
    }
}

@Preview(showBackground = true, showSystemUi = false)
@Composable
fun PreviewTitleSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF007BFF))
            .padding(16.dp)
    ) {
        TitleSection(
            title = "Sign In",
            subtitle = "Welcome back, you've been missed!"
        )
    }
}


