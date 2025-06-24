package com.sinannuhoglu.authflowkit.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Text as Text

@Composable
fun EmailTextField(email: String, onValueChange: (String) -> Unit) {
    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value = email,
        onValueChange = onValueChange,
        label = { Text(text = "Email") },
        leadingIcon = { Icon(imageVector = Icons.Filled.Email, contentDescription = null) },
        singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)

    )
}

@Preview(showBackground = true)
@Composable
fun PreviewEmailTextField() {
    EmailTextField("example@gmail.com", {})
}