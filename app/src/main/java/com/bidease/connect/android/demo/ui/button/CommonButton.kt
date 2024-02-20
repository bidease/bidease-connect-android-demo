package com.bidease.connect.android.demo.ui.button

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CommonButton(title: String, onClick: () -> Unit) {
    Button(
        onClick = onClick, colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF007AFF)
        ), shape = RoundedCornerShape(10.dp), modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            fontSize = 17.sp,
            fontWeight = FontWeight.Bold,
            text = title
        )
    }
}