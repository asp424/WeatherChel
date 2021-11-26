package com.example.weatherable.ui.cells

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherable.R
import com.example.weatherable.utilites.deleteSymbols

@Composable
fun CellValue(
    string: String?, color: Color = Color.Black,
    fontWeight: FontWeight = FontWeight.Medium
) {
    deleteSymbols(string)?.let {
        Text(
            text = it,
            fontSize = 12.sp,
            fontWeight = fontWeight,
            modifier = Modifier
                .padding(2.dp)
                .padding(end = 4.dp, start = 6.dp),

            style = TextStyle(color = color), textAlign = TextAlign.Center
        )
    }
}

@Composable
fun CellHeader(
    string: String,
    fontSize: TextUnit = 20.sp,
    color: Color = Color.White,
    paddingEnd: Dp = 0.dp, paddingTop: Dp = 6.dp,
    paddingStart: Dp = 0.dp, paddingBottom: Dp = 0.dp,
    backGroundColor: Color = Color.Transparent
) {
    Text(
        text = string,
        fontSize = fontSize,
        style = TextStyle(
            color = color,
            shadow = Shadow(
                color = Color.DarkGray,
                blurRadius = 5.5f,
                offset = Offset(7.0F, 9.0f)
            ), background = backGroundColor
        ),
        modifier = Modifier.padding(
            top = paddingTop,
            bottom = paddingBottom,
            start = paddingStart,
            end = paddingEnd
        )
    )
}


@Composable
fun CellWaterName(
    string: String,
    color: Color = Color.Blue,
    paddingEnd: Dp = 0.dp,
    paddingTop: Dp = 3.dp,
    paddingStart: Dp = 7.dp,
) {
    Text(
        text = string,
        fontWeight = FontWeight.Normal,
        modifier = Modifier.padding(start = paddingStart, top = paddingTop, end = paddingEnd),
        style = TextStyle(color = color)
    )
}

@Composable
fun CellBackgroundImage() {
    Image(
        painter = painterResource(id = R.drawable.ass),
        contentDescription = null,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        alignment = Alignment.TopCenter,
        contentScale = ContentScale.FillWidth
    )
}


