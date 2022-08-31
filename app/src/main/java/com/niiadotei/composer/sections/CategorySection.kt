package com.niiadotei.composer.sections

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.niiadotei.composer.R

@Preview
@Composable
fun CategorySectionPreview() {
    CategorySection()
}

@Composable
fun CategorySection() {
    Column(
        modifier = Modifier.padding(horizontal = 16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Category",
                style = MaterialTheme.typography.h6
            )

            TextButton(onClick = {}) {
                Text(
                    text = "More",
                    color = MaterialTheme.colors.primary
                )
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            CategoryButton(
                text = "construction",
                icon = painterResource(id = R.drawable.category) ,
                backgroundColor = Color.White
            )

            CategoryButton(
                text = "cars",
                icon = painterResource(id = R.drawable.category),
                backgroundColor = Color.White
            )

            CategoryButton(
                text = "phones",
                icon = painterResource(id = R.drawable.category),
                backgroundColor = Color.White
            )

            CategoryButton(
                text = "groceries",
                icon = painterResource(id = R.drawable.category),
                backgroundColor = Color.White
            )
        }
    }
}

@Composable
fun CategoryButton(
    text: String = "",
    icon: Painter,
    backgroundColor: Color
) {
    Column(
        modifier = Modifier
            .width(72.dp)
            .clickable { }
    ) {
        Box(
            modifier = Modifier
                .size(72.dp)
                .background(
                    color = backgroundColor,
                    shape = RoundedCornerShape(12.dp)
                )
                .padding(18.dp)
        ) {
            Image(
                painter = icon,
                contentDescription = "category icon",
                modifier = Modifier.fillMaxSize()
            )
        }

        Text(
            text = text,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 10.sp
        )
    }

}