package com.sinannuhoglu.authflowkit.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.sinannuhoglu.authflowkit.ui.home.HomePage
import com.sinannuhoglu.authflowkit.ui.login.LoginPage
import com.sinannuhoglu.authflowkit.ui.register.RegisterPage
import com.sinannuhoglu.authflowkit.ui.welcome.WelcomePage

object Routes {
    const val WELCOME = "welcome"
    const val LOGIN = "login"
    const val REGISTER = "register"
    const val HOME = "home"
}

@Composable
fun AppNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Routes.WELCOME) {

        composable(Routes.WELCOME) {
            WelcomePage(
                onSignInClick = { navController.navigate(Routes.LOGIN) },
                onSignUpClick = { navController.navigate(Routes.REGISTER) }
            )
        }

        composable(Routes.LOGIN) {
            LoginPage(navController = navController)
        }

        composable(Routes.REGISTER) {
            RegisterPage(navController = navController)
        }

        composable(Routes.HOME) {
            HomePage()
        }
    }
}
