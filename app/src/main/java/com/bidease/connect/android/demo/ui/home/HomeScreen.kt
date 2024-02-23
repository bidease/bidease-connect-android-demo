package com.bidease.connect.android.demo.ui.home

import android.app.Activity
import android.view.Gravity
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.bidease.ads.BannerSize
import com.bidease.ads.BannerView
import com.bidease.ads.DisplayListener
import com.bidease.ads.Interstitial
import com.bidease.ads.LoadListener
import com.bidease.ads.Rewarded
import com.bidease.ads.RewardedDisplayListener
import com.bidease.connect.android.demo.AdNetworks
import com.bidease.connect.android.demo.R
import com.bidease.connect.android.demo.ui.button.CommonButton

@Composable
fun HomeScreen(navController: NavHostController) {
    val activity = LocalContext.current as Activity

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
                onClick = {
                    println("BideaseSDK: showInterstitial")
                    val interstitial = Interstitial(activity)
                    interstitial.load(object : LoadListener {
                        override fun onLoadSuccess(adNetwork: String) {
                            println("BideaseSDK: Interstitial: onLoadSuccess $adNetwork")
                            interstitial.show(object : DisplayListener {
                                override fun onDisplayed(adNetwork: String) {
                                    println("BideaseSDK: Interstitial: onDisplayed $adNetwork")
                                }

                                override fun onFailed(error: String) {
                                    println("BideaseSDK: Interstitial: onFailed: ${error}")
                                }

                                override fun onClicked(adNetwork: String) {
                                    println("BideaseSDK: Interstitial: onClicked $adNetwork")
                                }

                                override fun onClosed(adNetwork: String) {
                                    println("BideaseSDK: Interstitial: onClosed $adNetwork")
                                }
                            })
                        }

                        override fun onLoadError(error: String) {
                            println("BideaseSDK: Interstitial: onLoadError: ${error}")
                        }

                    })
                }
            )
            Spacer(modifier = Modifier.height(38.dp))
            CommonButton(
                title = "Show Rewarded",
                onClick = {
                    println("BideaseSDK: showRewarded")
                    val rewarded = Rewarded(activity)
                    rewarded.load(object : LoadListener {
                        override fun onLoadSuccess(adNetwork: String) {
                            println("BideaseSDK: Rewarded: onLoadSuccess $adNetwork")
                            rewarded.show(object : RewardedDisplayListener {
                                override fun onDisplayed(adNetwork: String) {
                                    println("BideaseSDK: Rewarded: onDisplayed $adNetwork")
                                }

                                override fun onFailed(error: String) {
                                    println("BideaseSDK: Rewarded: onFailed: ${error}")
                                }

                                override fun onClicked(adNetwork: String) {
                                    println("BideaseSDK: Rewarded: onClicked $adNetwork")
                                }

                                override fun onClosed(adNetwork: String) {
                                    println("BideaseSDK: Rewarded: onClosed $adNetwork")
                                }

                                override fun onRewarded(adNetwork: String) {
                                    println("BideaseSDK: Rewarded: onRewarded $adNetwork")
                                }
                            })
                        }

                        override fun onLoadError(error: String) {
                            println("BideaseSDK: Rewarded: onLoadError: ${error}")
                        }

                    })
                }
            )
            Spacer(modifier = Modifier.height(38.dp))
            CommonButton(
                title = "Show Banner",
                onClick = {
                    println("BideaseSDK: showBanner")
                    BannerView(activity, BannerSize.BANNER_320x50).apply {
                        setRefreshInterval(30)
                        show(activity, Gravity.BOTTOM or Gravity.CENTER_HORIZONTAL, object : DisplayListener {
                            override fun onDisplayed(adNetwork: String) {
                                println("BideaseSDK: Banner 320x50: onDisplayed $adNetwork")
                            }

                            override fun onFailed(error: String) {
                                println("BideaseSDK: Banner 320x50: onFailed: ${error}")
                            }

                            override fun onClicked(adNetwork: String) {
                                println("BideaseSDK: Banner 320x50: onClicked $adNetwork")
                            }

                            override fun onClosed(adNetwork: String) {
                                println("BideaseSDK: Banner 320x50: onClosed $adNetwork")
                            }

                        })
                        load(object : LoadListener {
                            override fun onLoadSuccess(adNetwork: String) {
                                println("BideaseSDK: Banner 320x50: onLoadSuccess $adNetwork")
                            }

                            override fun onLoadError(error: String) {
                                println("BideaseSDK: Banner 320x50: onLoadError: ${error}")
                            }

                        })
                    }
                }
            )
//            Spacer(modifier = Modifier.height(38.dp))
//            CommonButton(
//                title = "Logs",
//                onClick = {}
//            )
        }
    }
}