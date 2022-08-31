package com.niiadotei.composer.sections

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.niiadotei.composer.R

@Preview
@Composable
fun LoginSectionPreview() {
    LoginSection()
}

@Composable
fun LoginSection() {
    var phone by remember { mutableStateOf("") }

    var password by remember { mutableStateOf("") }

    var isPasswordOpen by remember { mutableStateOf(false) }

    Box(
        contentAlignment = Alignment.BottomCenter
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Minion",
                fontSize = 28.sp,
                color = Color.Black,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .padding(top = 40.dp),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold
            )

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 40.dp),
                backgroundColor = Color.White,
                elevation = 0.dp,
                shape = RoundedCornerShape(topStart = 14.dp, topEnd = 14.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Log in with Phone number",
                        color = Color.Gray,
                        fontSize = 12.sp,
                        modifier = Modifier.padding(top = 16.dp)
                    )

                    OutlinedTextField(
                        value = phone,
                        onValueChange = {phone = it},
                        label = {
                            Text(
                                text = "Phone number",
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
                            keyboardType = KeyboardType.Phone
                        ),
                        singleLine = true,
                        leadingIcon = {
                            Icon(
                                painter = painterResource(id = R.drawable.phone),
                                contentDescription = "Phone number",
                                tint = Color.Black,
                                modifier = Modifier.size(24.dp)
                            )
                        }
                    )

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

                    Button(
                        onClick = {

                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp)
                            .padding(top = 20.dp),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color.Black,
                            contentColor = Color.White
                        ),
                        contentPadding = PaddingValues(vertical = 14.dp)
                    ) {
                        Text(
                            text = "Login",
                        )
                    }

                    Spacer(
                        modifier = Modifier.height(26.dp)
                    )

                    TextButton(
                        onClick = {},
                        contentPadding = PaddingValues(vertical = 0.dp)
                    ) {
                        Text(
                            text = "Forgot Password?",
                            color = Color.Black,
                            fontSize = 12.sp,
                            modifier = Modifier.padding(top = 12.dp)
                        )
                    }

                    TextButton(
                        onClick = {

                        },
                        contentPadding = PaddingValues(vertical = 0.dp)
                    ) {
                        Text(
                            text = "Don't have an account? Sign up",
                            color = Color.Black,
                            fontSize = 12.sp
                        )
                    }

                    Spacer(
                        modifier = Modifier.height(20.dp)
                    )
                }
            }
        }
    }
}