package com.bidease.config

import com.bidease.ads.adnetwork.applovin.AppLovinFactory
import com.bidease.ads.adnetwork.bidease.BideaseFactory
import com.bidease.ads.adnetwork.chartboost.ChartboostFactory
import com.bidease.ads.adnetwork.fyber.FyberFactory
import com.bidease.ads.adnetwork.mintegral.MintegralFactory
import com.bidease.ads.adnetwork.pangle.PangleFactory
import com.bidease.ads.adnetwork.unity.UnityFactory
import com.bidease.ads.adnetwork.vungle.VungleFactory
import com.bidease.ads.mediation.AdNetworkConfig

interface TestConfigs {
    val bannerConfig: AdNetworkConfig
    val bannerIABConfig: AdNetworkConfig
    val interstitialConfig: AdNetworkConfig
    val interstitialIABConfig: AdNetworkConfig
    val rewardedConfig: AdNetworkConfig
    val rewardedIABConfig: AdNetworkConfig

    companion object {
        fun getConfig(id: Int) = when (id) {
            AppLovinFactory.ID -> AppLovinConfigs
            BideaseFactory.ID -> BideaseConfigs
            ChartboostFactory.ID -> ChartboostConfigs
            FyberFactory.ID -> FyberConfigs
            MintegralFactory.ID -> MintegralConfigs
            PangleFactory.ID -> PangleConfigs
            UnityFactory.ID -> UnityConfigs
            VungleFactory.ID -> VungleConfigs
            else -> null
        }
    }
}