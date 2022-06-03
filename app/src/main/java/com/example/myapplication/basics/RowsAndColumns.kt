package com.example.myapplication.basics

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle.Companion.Italic
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * @modifier used to set Row attributes
 * A Row has a horizontal orientation
 */
@Composable
 fun ARow(modifier: Modifier){
    Row(modifier = modifier
        .height(20.dp)
        .width(40.dp)
        .background(Color.Blue)
    ) {
        //Display a text in row
        Text(text = "Hello there!!", fontSize = 18.sp,
            color = Color.Black, fontStyle = Italic,
            fontFamily = FontFamily.SansSerif)
        //Add a button after the text
        Button(onClick = { /*DO SOMETHING*/ }) {
            //Add button text
            Text(text = "I am clickable")
        }
    }
 }

/**
 * @modifier used to set Column attributes
 * A column has a vertical orientation
 */
@Composable
fun AColumn(modifier: Modifier){
    Column(modifier = modifier
        .width(20.dp) // use modifier.height to set column height
        .height(20.dp) // use modifier.width to set column width
        .background(Color.Blue)
    ){
        //Display a text in this column
        Text(text = "Hello there!!", fontSize = 18.sp,
            color = Color.Black, fontStyle = Italic,
            fontFamily = FontFamily.SansSerif)
        //Add a button after the text it will appear below the text
        Button(onClick = { /*DO SOMETHING*/ },
            /**Use @modifier.padding(size) padding unlike margin in xml views,
             * although unlike margin, negative padding is not allowed here
             * Apply padding before content measurement because content can oly take the remaining space
             */
            modifier = modifier.padding(5.dp)
            ) {
            //Add button text
            Text(text = "I am clickable")
        }
    }
}