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
import androidx.navigation.NavHostController
import com.bidease.ads.adnetwork.applovin.AppLovinFactory
import com.bidease.ads.adnetwork.bidease.BideaseFactory
import com.bidease.ads.adnetwork.chartboost.ChartboostFactory
import com.bidease.ads.adnetwork.fyber.FyberFactory
import com.bidease.ads.adnetwork.mintegral.MintegralFactory
import com.bidease.ads.adnetwork.pangle.PangleFactory
import com.bidease.ads.adnetwork.unity.UnityFactory
import com.bidease.ads.adnetwork.vungle.VungleFactory
import com.bidease.connect.android.demo.AdNetworks
import com.bidease.connect.android.demo.R
import com.bidease.connect.android.demo.ui.button.CommonButton

@Composable
fun AdNetworksScreen(navController: NavHostController) {
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
                onClick = { navController.navigate("adNetwork/${AppLovinFactory.ID}") }
            )
            Spacer(modifier = Modifier.height(16.dp))
            CommonButton(
                title = "Bidease",
                onClick = { navController.navigate("adNetwork/${BideaseFactory.ID}") }
            )
            Spacer(modifier = Modifier.height(16.dp))
            CommonButton(
                title = "Chartboost",
                onClick = { navController.navigate("adNetwork/${ChartboostFactory.ID}") }
            )
            Spacer(modifier = Modifier.height(16.dp))
            CommonButton(
                title = "Digital Turbine",
                onClick = { navController.navigate("adNetwork/${FyberFactory.ID}") }
            )
            Spacer(modifier = Modifier.height(16.dp))
            CommonButton(
                title = "Mintegral",
                onClick = { navController.navigate("adNetwork/${MintegralFactory.ID}") }
            )
            Spacer(modifier = Modifier.height(16.dp))
            CommonButton(
                title = "Pangle",
                onClick = { navController.navigate("adNetwork/${PangleFactory.ID}") }
            )
//            Spacer(modifier = Modifier.height(16.dp))
//            CommonButton(
//                title = "Start.io",
//                onClick = {}
//            )
            Spacer(modifier = Modifier.height(16.dp))
            CommonButton(
                title = "Unity",
                onClick = { navController.navigate("adNetwork/${UnityFactory.ID}") }
            )
            Spacer(modifier = Modifier.height(16.dp))
            CommonButton(
                title = "Vungle",
                onClick = { navController.navigate("adNetwork/${VungleFactory.ID}") }
            )
        }
    }
}