package com.niiadotei.composer.sections

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.niiadotei.composer.R

@Preview
@Composable
fun PromotionSectionPreview() {
    PromotionSection()
}

@Composable
fun PromotionSection() {
    LazyRow(
        modifier = Modifier.height(160.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            val painter = rememberAsyncImagePainter(R.drawable.promotion)

            PromotionItem(
                imagePainter = painter,
                title = "Find",
                subTitle = "any product",
                header = "Now",
                backgroundColor = MaterialTheme.colors.primary
            )
        }

        item {
            val painter = rememberAsyncImagePainter(R.drawable.promotion)

            PromotionItem(
                imagePainter = painter,
                title = "Reach customers",
                subTitle = "at Lightning",
                header = "Speed",
                backgroundColor = MaterialTheme.colors.primary
            )
        }

        item {
            val painter = rememberAsyncImagePainter(R.drawable.promotion)

            PromotionItem(
                imagePainter = painter,
                title = "Build bonds",
                subTitle = "with partners",
                header = "",
                backgroundColor = MaterialTheme.colors.primary
            )
        }
    }
}

@Composable
fun PromotionItem(
    title: String = "",
    subTitle: String = "",
    header: String = "",
    backgroundColor: Color = Color.Transparent,
    imagePainter: Painter
) {
    Card(
        modifier = Modifier.width(300.dp),
        shape = RoundedCornerShape(8.dp),
        backgroundColor = backgroundColor,
        elevation = 0.dp
    ) {
        Row {
            Column(
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = title,
                    fontSize = 14.sp,
                    color = Color.White
                )

                Text(
                    text = subTitle,
                    fontSize = 16.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = header,
                    fontSize = 28.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }

            Image(
                painter = imagePainter,
                contentDescription = "Promotion Image",
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(weight = 1f),
                alignment = Alignment.CenterEnd,
                contentScale = ContentScale.Crop
            )
        }
    }
}