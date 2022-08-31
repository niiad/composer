package com.niiadotei.composer.buttons

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.niiadotei.composer.R

@Preview
@Composable
fun GoogleButtonPreview() {
    GoogleButton()
}

@Composable
fun GoogleButton() {
    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.White
        ),
        contentPadding = PaddingValues(horizontal = 20.dp, vertical = 10.dp),
        modifier = Modifier.padding(top = 20.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.google),
                contentDescription = "",
                tint = Color.Unspecified,
                modifier = Modifier.size(26.dp)
            )

            Spacer(
                modifier = Modifier.width(16.dp)
            )

            Text(
                text = "Continue with Google",
                color = Color.Black,
                fontSize = 16.sp
            )
        }
    }
}