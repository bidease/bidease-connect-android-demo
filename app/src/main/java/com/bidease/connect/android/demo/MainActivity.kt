package com.bidease.connect.android.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bidease.ads.BideaseConnect
import com.bidease.ads.InitializationListener
import com.bidease.connect.android.demo.ui.theme.BideaseConnectAndroidDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        BideaseConnect.initialize(
            this,
            "bffc350f-a194-4c08-9606-be01fbc12010:06971dae-fcb5-4cfc-8ea9-5d6d451b4624", // demo app key
            object : InitializationListener {
                override fun onInitializationSuccess() {
                    println("BideaseSDK: onInitializationSuccess")
                }

                override fun onInitializationError(error: String) {
                    println("BideaseSDK: onInitializationError: ${error}")
                }
            }
        )

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