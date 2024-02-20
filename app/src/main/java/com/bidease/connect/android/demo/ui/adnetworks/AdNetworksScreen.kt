package com.bidease.connect.android.demo.ui.adnetworks

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.bidease.connect.android.demo.R
import com.bidease.connect.android.demo.ui.button.CommonButton

@Composable
fun AdNetworksScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.bg),
                contentScale = ContentScale.FillBounds
            ),
        contentAlignment = Alignment.TopCenter
    ) {
        Column(modifier = Modifier.width(250.dp)) {
            Spacer(modifier = Modifier.height(54.dp))
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "logo"
            )
            Spacer(modifier = Modifier.height(16.dp))
            CommonButton(
                title = "AppLovin",
                onClick = {}
            )
            Spacer(modifier = Modifier.height(16.dp))
            CommonButton(
                title = "Bidease",
                onClick = {}
            )
            Spacer(modifier = Modifier.height(16.dp))
            CommonButton(
                title = "Chartboost",
                onClick = {}
            )
            Spacer(modifier = Modifier.height(16.dp))
            CommonButton(
                title = "Digital Turbine",
                onClick = {}
            )
            Spacer(modifier = Modifier.height(16.dp))
            CommonButton(
                title = "Mintegral",
                onClick = {}
            )
            Spacer(modifier = Modifier.height(16.dp))
            CommonButton(
                title = "Pangle",
                onClick = {}
            )
            Spacer(modifier = Modifier.height(16.dp))
            CommonButton(
                title = "Start.io",
                onClick = {}
            )
            Spacer(modifier = Modifier.height(16.dp))
            CommonButton(
                title = "Unity",
                onClick = {}
            )
            Spacer(modifier = Modifier.height(16.dp))
            CommonButton(
                title = "Vungle",
                onClick = {}
            )
        }
    }
}