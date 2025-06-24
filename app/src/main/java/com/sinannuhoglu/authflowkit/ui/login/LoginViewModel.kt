package com.sinannuhoglu.authflowkit.ui.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class LoginViewModel : ViewModel() {

    private val auth: FirebaseAuth = FirebaseAuth.getInstance()

    var email = MutableStateFlow("")
    var password = MutableStateFlow("")

    private val _errorMessage = MutableStateFlow<String?>(null)
    val errorMessage = _errorMessage.asStateFlow()

    private val _loginSuccess = MutableStateFlow(false)
    val loginSuccess = _loginSuccess.asStateFlow()

    fun onLoginClick() {
        if (email.value.isBlank() || password.value.isBlank()) {
            _errorMessage.value = "Email and password cannot be empty."
            return
        }

        viewModelScope.launch {
            auth.signInWithEmailAndPassword(email.value, password.value)
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        _errorMessage.value = null
                        _loginSuccess.value = true
                    } else {
                        _errorMessage.value = task.exception?.message ?: "Login failed"
                    }
                }
        }
    }
}
