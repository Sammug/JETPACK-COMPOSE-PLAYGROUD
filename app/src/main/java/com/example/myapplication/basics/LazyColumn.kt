package com.example.myapplication.basics

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Surface
import androidx.compose.material.Text
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
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(10.dp),
            reverseLayout = false,
            modifier = Modifier.align(
                alignment = Alignment.Center
            )
        ) {
            for (number in 0..40){
                item {
                    TextField(value = number.toString(), onValueChange = {
                        number.toString()
                    },
                        modifier = Modifier.size(200.dp, 48.dp)

                    )
                }
            }
        }
    }
}