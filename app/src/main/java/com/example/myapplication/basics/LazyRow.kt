package com.example.myapplication.basics

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ListRow() {
    Box(modifier = Modifier
        .fillMaxWidth()
        .height(100.dp)
        .background(Color.White)
    ){
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp),//content spacing
            contentPadding = PaddingValues(horizontal = 8.dp, vertical = 8.dp),//content spacing
            reverseLayout = false,
            modifier = Modifier.align(
                alignment = Alignment.Center
            )
                .padding(top = 8.dp, bottom = 8.dp)
        ) {
            for (number in 0..40){
                item {
                    TextField(value = number.toString(), onValueChange = {
                        it
                    },
                        modifier = Modifier
                            .size(100.dp, 80.dp)
                            .background(Color.DarkGray),
                        textStyle = TextStyle(
                            color = Color.White,
                            fontSize = 16.sp,
                            fontFamily = FontFamily.SansSerif
                        )
                    )
                }
            }
        }
    }
}