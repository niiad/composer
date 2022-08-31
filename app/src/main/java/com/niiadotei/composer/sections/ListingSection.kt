package com.niiadotei.composer.sections

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.niiadotei.composer.R

@Preview
@Composable
fun ListingSectionPreview() {
    ListingSection()
}

@Composable
fun ListingSection() {
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Products",
                style = MaterialTheme.typography.h6
            )

            TextButton(onClick = {}) {
                Text(
                    text = "Filter",
                    color = MaterialTheme.colors.primary
                )
            }
        }

        ListedItems()
    }
}

@Composable
fun ListedItems() {
    LazyRow(
        contentPadding = PaddingValues(vertical = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // add items here remotely using item {} -> in a for each
        item {
            ItemTemplate(
                title = "name",
                price = "400",
                discountPercent = 0,
                imagePainter = painterResource(id = R.drawable.listing)
            )
        }

        item {
            ItemTemplate(
                title = "name",
                price = "400",
                discountPercent = 0,
                imagePainter = painterResource(id = R.drawable.listing)
            )
        }

        item {
            ItemTemplate(
                title = "name",
                price = "400",
                discountPercent = 0,
                imagePainter = painterResource(id = R.drawable.listing)
            )
        }

        item {
            ItemTemplate(
                title = "name",
                price = "400",
                discountPercent = 5,
                imagePainter = painterResource(id = R.drawable.listing)
            )
        }
    }
}

@Composable
fun ItemTemplate(
    title: String = "",
    price: String = "",
    discountPercent: Int = 0,
    imagePainter: Painter
) {
    Card(
        modifier = Modifier
            .width(200.dp)

    ) {
        Column(modifier = Modifier.padding(bottom = 32.dp)) {
            Image(
                painter = imagePainter,
                contentDescription = "Template image",
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1f),
                contentScale = ContentScale.Fit
            )

            Column(
                modifier = Modifier.padding(horizontal = 8.dp)
            ) {
                Text(
                    text = title,
                    fontWeight = FontWeight.Bold
                )

                Row {
                    Text(
                        text = "$${price}",
                        textDecoration = if (discountPercent > 0) TextDecoration.LineThrough else TextDecoration.None,
                        color = if (discountPercent > 0) Color.Black else Color.Gray
                    )

                    if (discountPercent > 0) {
                        Text(
                            text = "[$discountPercent%]",
                            color = MaterialTheme.colors.primary
                        )
                    }
                }
            }
        }
    }
}