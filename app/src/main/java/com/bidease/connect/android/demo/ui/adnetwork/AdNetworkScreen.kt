package com.bidease.connect.android.demo.ui.adnetwork

import android.app.Activity
import android.util.TypedValue
import android.view.Gravity
import android.widget.FrameLayout
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.bidease.ads.BannerSize
import com.bidease.ads.DefaultAdNetworkFactoryResolver
import com.bidease.ads.DisplayListener
import com.bidease.ads.RewardedDisplayListener
import com.bidease.ads.mediation.AdFormat
import com.bidease.config.TestConfigs
import com.bidease.connect.android.demo.R
import com.bidease.connect.android.demo.TestLogServiceFactory
import com.bidease.connect.android.demo.ui.button.CommonButton

@Composable
fun AdNetworkScreen(navController: NavHostController, adNetworkId: Int) {
    val adNetworkFactory =
        DefaultAdNetworkFactoryResolver.getInstance().resolve(adNetworkId) ?: run {
            navController.popBackStack()
            return
        }
    val testConfig = TestConfigs.getConfig(adNetworkId) ?: run {
        navController.popBackStack()
        return
    }
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
            Text(
                text = testConfig.bannerConfig.name,
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(38.dp))
            CommonButton(
                title = "Show Interstitial",
                onClick = {
                    println("BideaseSDK: showInterstitial")
                    adNetworkFactory.getAdNetworkInterstitialFactory(
                        TestLogServiceFactory.getLogService(),
                        "",
                        testConfig.interstitialConfig,
                        0,
                        AdFormat.INTERSTITIAL,
                    )
                        .getAdNetworkAdLoader(activity).load(null, { adNetwokDisplayable, adInfo ->
                            adNetwokDisplayable.show({
                                println("BideaseSDK: Interstitial: Show Success")
                            }, { error ->
                                println("BideaseSDK: Interstitial: Show Error: ${error}")
                            }, object : DisplayListener {
                                override fun onDisplayed(adNetwork: String) {
                                    println("BideaseSDK: Interstitial: onDisplayed: ${adNetwork}")
                                }

                                override fun onFailed(error: String) {
                                    println("BideaseSDK: Interstitial: onFailed: ${error}")
                                }

                                override fun onClicked(adNetwork: String) {
                                    println("BideaseSDK: Interstitial: onClicked: ${adNetwork}")
                                }

                                override fun onClosed(adNetwork: String) {
                                    println("BideaseSDK: Interstitial: onClosed: ${adNetwork}")
                                }
                            })
                        }, { error ->
                            println("BideaseSDK: Interstitial: Load Error: ${error}")
                        })
                }
            )
            Spacer(modifier = Modifier.height(38.dp))
            CommonButton(
                title = "Show Rewarded",
                onClick = {
                    println("BideaseSDK: showRewarded")
                    adNetworkFactory.getAdNetworkRewardedFactory(
                        TestLogServiceFactory.getLogService(),
                        "",
                        testConfig.rewardedConfig,
                        0,
                        AdFormat.REWARDED,
                    )
                        .getAdNetworkAdLoader(activity).load(null, { adNetwokDisplayable, adInfo ->
                            adNetwokDisplayable.show({
                                println("BideaseSDK: Rewarded: Show Success")
                            }, { error ->
                                println("BideaseSDK: Rewarded: Show Error: ${error}")
                            }, object : RewardedDisplayListener {
                                override fun onDisplayed(adNetwork: String) {
                                    println("BideaseSDK: Rewarded: onDisplayed: ${adNetwork}")
                                }

                                override fun onFailed(error: String) {
                                    println("BideaseSDK: Rewarded: onFailed: ${error}")
                                }

                                override fun onClicked(adNetwork: String) {
                                    println("BideaseSDK: Rewarded: onClicked: ${adNetwork}")
                                }

                                override fun onClosed(adNetwork: String) {
                                    println("BideaseSDK: Rewarded: onClosed: ${adNetwork}")
                                }

                                override fun onRewarded(adNetwork: String?) {
                                    println("BideaseSDK: Rewarded: onRewarded: ${adNetwork}")
                                }
                            })
                        }, { error ->
                            println("BideaseSDK: Rewarded: Load Error: ${error}")
                        })
                }
            )
            Spacer(modifier = Modifier.height(38.dp))
            CommonButton(
                title = "Show Banner",
                onClick = {
                    println("BideaseSDK: showBanner")
                    adNetworkFactory.getAdNetworkBannerFactory(
                        TestLogServiceFactory.getLogService(),
                        "",
                        testConfig.bannerConfig,
                        0,
                        AdFormat.BANNER,
                        BannerSize.BANNER_320x50
                    )
                        .getAdNetworkAdLoader(activity)
                        .load(null, { adNetworkDisplayable, adInfo ->
                            adNetworkDisplayable.show({ view ->
                                println("BideaseSDK: Banner: Show Success")
                                activity.window.addContentView(
                                    view,
                                    FrameLayout.LayoutParams(
                                        FrameLayout.LayoutParams.MATCH_PARENT,
                                        TypedValue.applyDimension(
                                            TypedValue.COMPLEX_UNIT_DIP,
                                            50f,
                                            activity.resources.displayMetrics
                                        ).toInt(),
                                        Gravity.BOTTOM or Gravity.CENTER_HORIZONTAL
                                    )
                                )
                            }, { error ->
                                println("BideaseSDK: Banner: Show Error ${error}")
                            }, object : DisplayListener {
                                override fun onDisplayed(adNetwork: String) {
                                    println("BideaseSDK: Banner: onDisplayed: ${adNetwork}")
                                }

                                override fun onFailed(error: String) {
                                    println("BideaseSDK: Banner: onFailed: ${error}")
                                }

                                override fun onClicked(adNetwork: String) {
                                    println("BideaseSDK: Banner: onClicked: ${adNetwork}")
                                }

                                override fun onClosed(adNetwork: String) {
                                    println("BideaseSDK: Banner: onClosed: ${adNetwork}")
                                }
                            })
                        }, { error ->
                            println("BideaseSDK: Banner: Load Error ${error}")
                        })
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