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
import androidx.compose.ui.unit.dp

@Composable
fun ListColumn() {
    Box(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .background(Color.LightGray)
    ){
        Column(modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
        ) {
            ListRow()
        }
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(10.dp),//content spacing
            contentPadding = PaddingValues(horizontal = 24.dp, vertical = 8.dp),//content spacing
            reverseLayout = false,
            modifier = Modifier
                .align(
                    alignment = Alignment.Center
                )
                .padding(top = 100.dp, bottom = 10.dp)
        ) {
            for (number in 0..10){
                item {
                    TextField(value = number.toString(), onValueChange = {
                        it
                    },
                        modifier = Modifier.size(200.dp, 48.dp)

                    )
                }
            }
        }
    }
}