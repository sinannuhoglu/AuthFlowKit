package com.sinannuhoglu.authflowkit.ui.welcome

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sinannuhoglu.authflowkit.ui.components.FilledWhiteButton
import com.sinannuhoglu.authflowkit.ui.components.LargeSpace
import com.sinannuhoglu.authflowkit.ui.components.MediumSpace
import com.sinannuhoglu.authflowkit.ui.components.OutlinedButtonItem
import com.sinannuhoglu.authflowkit.ui.components.TitleSection

@Composable
fun WelcomePage(
    onSignInClick: () -> Unit = {},
    onSignUpClick: () -> Unit = {}
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(Color(0xFF002366), Color(0xFF007BFF))
                )
            )
            .padding(24.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            TitleSection(
                title = "Get Started",
                subtitle = "Start with sign up or sign in"
            )
            LargeSpace()
            OutlinedButtonItem(text = "SIGN IN", onClick = onSignInClick)
            MediumSpace()
            FilledWhiteButton(text = "SIGN UP", onClick = onSignUpClick)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewWelcomePage() {
    WelcomePage()
}
