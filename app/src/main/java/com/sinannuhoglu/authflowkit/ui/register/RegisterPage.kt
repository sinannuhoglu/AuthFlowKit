package com.sinannuhoglu.authflowkit.ui.register

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.sinannuhoglu.authflowkit.ui.components.*

@Composable
fun RegisterPage(
    navController: NavController,
    viewModel: RegisterViewModel = viewModel()
) {
    val email by viewModel.email.collectAsState()
    val password by viewModel.password.collectAsState()
    val confirmPassword by viewModel.confirmPassword.collectAsState()
    val error by viewModel.errorMessage.collectAsState()
    val success by viewModel.registerSuccess.collectAsState()
    val snackbarHostState = remember { SnackbarHostState() }

    LaunchedEffect(success) {
        if (success) {
            snackbarHostState.showSnackbar("Kayıt başarılı! Giriş yapabilirsiniz.")
            navController.navigate("login") {
                popUpTo("register") { inclusive = true }
            }
        }
    }

    RegisterPageContent(
        navController = navController,
        email = email,
        password = password,
        confirmPassword = confirmPassword,
        errorMessage = error,
        onEmailChange = { viewModel.email.value = it },
        onPasswordChange = { viewModel.password.value = it },
        onConfirmPasswordChange = { viewModel.confirmPassword.value = it },
        onRegisterClick = { viewModel.onRegisterClick() },
        onLoginClick = { navController.navigate("login") },
        snackbarHostState = snackbarHostState
    )
}

@Composable
fun RegisterPageContent(
    navController: NavController,
    email: String,
    password: String,
    confirmPassword: String,
    errorMessage: String?,
    onEmailChange: (String) -> Unit,
    onPasswordChange: (String) -> Unit,
    onConfirmPasswordChange: (String) -> Unit,
    onRegisterClick: () -> Unit,
    onLoginClick: () -> Unit,
    snackbarHostState: SnackbarHostState
) {
    Scaffold(snackbarHost = { SnackbarHost(snackbarHostState) }) { padding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .background(
                    Brush.horizontalGradient(
                        listOf(Color(0xFF002366), Color(0xFF007BFF))
                    )
                )
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                MediumSpace()
                TitleSection(
                    title = "Sign Up",
                    subtitle = "Create your account and get started"
                )
                ExtraLargeSpace()
                Card(
                    shape = RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    colors = CardDefaults.cardColors(containerColor = Color.White)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(24.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        EmailTextField(email = email, onValueChange = onEmailChange)
                        SmallSpace()
                        PasswordTextField(password = password, onValueChange = onPasswordChange)
                        SmallSpace()
                        PasswordTextField(
                            password = confirmPassword,
                            onValueChange = onConfirmPasswordChange
                        )

                        errorMessage?.let {
                            Text(
                                text = it,
                                color = Color.Red,
                                modifier = Modifier.padding(top = 8.dp)
                            )
                        }

                        MediumSpace()
                        GradientButton(text = "REGISTER", onClick = onRegisterClick)
                        SmallSpace()
                        Text(
                            text = "Already have an account? Sign in",
                            color = Color.Gray,
                            modifier = Modifier.clickable(onClick = onLoginClick)
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = false)
@Composable
fun PreviewRegisterPage() {
    val navController = rememberNavController()
    val dummySnackbarHost = remember { SnackbarHostState() }

    RegisterPageContent(
        navController = navController,
        email = "example@mail.com",
        password = "123456",
        confirmPassword = "123456",
        errorMessage = "Passwords do not match.",
        onEmailChange = {},
        onPasswordChange = {},
        onConfirmPasswordChange = {},
        onRegisterClick = {},
        onLoginClick = {},
        snackbarHostState = dummySnackbarHost
    )
}
