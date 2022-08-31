package com.niiadotei.composer.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
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
fun SearchBarPreview() {
    SearchBar()
}

@Composable
fun SearchBar() {
    Card(
        modifier = Modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(bottomStart = 16.dp, bottomEnd = 16.dp),
        backgroundColor = Color.Blue
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .height(48.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {

            TextField(
                value = "",
                onValueChange = {},
                label = {
                    Text(
                        text = "Search stuffs",
                        fontSize = 12.sp
                    )
                },
                singleLine = true,
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.search),
                        contentDescription = "Search "
                    )
                },
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.White,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .weight(weight = 1f)
                    .fillMaxHeight()
            )

            Spacer(modifier = Modifier.width(8.dp))

            IconButton(onClick = {}) {
                Icon(
                    painter = painterResource(id = R.drawable.love),
                    contentDescription = "favorite",
                    tint = Color.White,
                    modifier = Modifier.size(24.dp)
                )
            }

            IconButton(onClick = {}) {
                Icon(
                    painter = painterResource(id = R.drawable.message),
                    contentDescription = "chat",
                    tint = Color.White
                )
            }

        }
    }
}

// when used in top bar
@Composable
fun TopBarUseCase() {
    Box {
        Scaffold(
            topBar = {
                SearchBar()
            },
            backgroundColor = Color.Transparent
        ) { paddingValues ->  
            ContentSection(paddingValues = paddingValues)
        }
    }
}

@Composable
fun ContentSection(paddingValues: PaddingValues) {}