package com.niiadotei.composer.textFields

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.niiadotei.composer.R

@Preview
@Composable
fun PasswordFieldPreview() {
    PasswordField()
}

@Composable
fun PasswordField() {

    var password by remember { mutableStateOf("") }

    var isPasswordOpen by remember { mutableStateOf(false) }

    OutlinedTextField(
        value = password,
        onValueChange = {password = it},
        label = {
            Text(
                text = "Password",
                color = Color.Black
            )
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
            .padding(top = 10.dp),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            unfocusedBorderColor = Color.Black,
            focusedBorderColor = Color.Black,
            textColor = Color.Black
        ),
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Password
        ),
        singleLine = true,
        leadingIcon = {
            Icon(
                painter = painterResource(id = R.drawable.password),
                contentDescription = "Password",
                tint = Color.Black,
                modifier = Modifier.size(24.dp)
            )
        },
        visualTransformation = if(!isPasswordOpen) {
            PasswordVisualTransformation()
        } else {
            VisualTransformation.None},
        trailingIcon = {
            IconButton(
                onClick = {
                    isPasswordOpen = !isPasswordOpen
                }
            ) {
                if (!isPasswordOpen) {
                    Icon(
                        painter = painterResource(R.drawable.eye),
                        contentDescription = "Password opened",
                        tint = Color.Black,
                        modifier = Modifier.size(24.dp)
                    )
                } else {
                    Icon(
                        painter = painterResource(id = R.drawable.blind),
                        contentDescription = "Password closed",
                        tint = Color.Black,
                        modifier = Modifier.size(24.dp)
                    )
                }
            }
        }
    )
}