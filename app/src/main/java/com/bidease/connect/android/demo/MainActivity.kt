package com.bidease.connect.android.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bidease.connect.android.demo.ui.theme.BideaseConnectAndroidDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BideaseConnectAndroidDemoApp()
        }
    }
}

@Composable
fun BideaseConnectAndroidDemoApp() {
    BideaseConnectAndroidDemoTheme {
        val navController = rememberNavController()

        NavHost(
            navController = navController,
            startDestination = Home.route,
            modifier = Modifier
        ) {
            composable(route = Home.route) {
                Home.screen(navController)
            }
            composable(route = AdNetworks.route) {
                AdNetworks.screen(navController)
            }
        }
    }
}