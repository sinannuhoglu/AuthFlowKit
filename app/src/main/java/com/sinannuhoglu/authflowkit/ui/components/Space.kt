package com.sinannuhoglu.authflowkit.ui.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SmallSpace() {
    Spacer(modifier = Modifier.height(8.dp))
}

@Composable
fun MediumSpace() {
    Spacer(modifier = Modifier.height(20.dp))
}

@Composable
fun LargeSpace() {
    Spacer(modifier = Modifier.height(40.dp))
}

@Composable
fun ExtraLargeSpace() {
    Spacer(modifier = Modifier.height(120.dp))
}

