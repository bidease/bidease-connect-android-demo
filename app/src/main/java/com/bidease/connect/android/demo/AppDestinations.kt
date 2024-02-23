package com.bidease.connect.android.demo

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.List
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.bidease.connect.android.demo.ui.adnetwork.AdNetworkScreen
import com.bidease.connect.android.demo.ui.adnetworks.AdNetworksScreen
import com.bidease.connect.android.demo.ui.home.HomeScreen

object Home {
    val route = "home"
    val screen: @Composable (NavHostController) -> Unit = { HomeScreen(it) }
}

object AdNetworks {
    val route = "adNetworks"
    val screen: @Composable (NavHostController) -> Unit = { AdNetworksScreen(it) }
}

object AdNetwork {
    val route = "adNetwork/{adNetworkId}"
    val ARG_AD_NETWORK_ID = "adNetworkId"
    val arguments = listOf(navArgument(ARG_AD_NETWORK_ID) { type = NavType.IntType })
    val screen: @Composable (NavHostController, Int) -> Unit = { navController, adNetworkId ->
        AdNetworkScreen(navController, adNetworkId)
    }
}