package com.bidease.connect.android.demo

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavHostController
import com.bidease.connect.android.demo.ui.adnetworks.AdNetworksScreen
import com.bidease.connect.android.demo.ui.home.HomeScreen

interface AppDestination {
    val icon: ImageVector
    val route: String
    val screen: @Composable (NavHostController) -> Unit
}

object Home : AppDestination {
    override val icon = Icons.Filled.Home
    override val route = "home"
    override val screen: @Composable (NavHostController) -> Unit = { HomeScreen(it) }
}

object AdNetworks : AppDestination {
    override val icon = Icons.Filled.List
    override val route = "adnetworks"
    override val screen: @Composable (NavHostController) -> Unit = { AdNetworksScreen() }
}