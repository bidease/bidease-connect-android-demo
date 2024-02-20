package com.bidease.connect.android.demo.ui.home

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
import androidx.navigation.NavHostController
import com.bidease.connect.android.demo.AdNetworks
import com.bidease.connect.android.demo.R
import com.bidease.connect.android.demo.ui.button.CommonButton

@Composable
fun HomeScreen(navController: NavHostController) {
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
            Spacer(modifier = Modifier.height(108.dp))
            CommonButton(
                title = "Choose Ad Network",
                onClick = {
                    navController.navigate(AdNetworks.route)
                }
            )
            Spacer(modifier = Modifier.height(38.dp))
            CommonButton(
                title = "Show Interstitial",
                onClick = {}
            )
            Spacer(modifier = Modifier.height(38.dp))
            CommonButton(
                title = "Show Rewarded",
                onClick = {}
            )
            Spacer(modifier = Modifier.height(38.dp))
            CommonButton(
                title = "Show Banner",
                onClick = {}
            )
            Spacer(modifier = Modifier.height(38.dp))
            CommonButton(
                title = "Logs",
                onClick = {}
            )
        }
    }
}