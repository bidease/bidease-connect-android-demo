package com.bidease.config

import com.bidease.ads.adnetwork.applovin.AppLovinFactory
import com.bidease.ads.mediation.AdNetworkConfig

object AppLovinConfigs: TestConfigs {
    const val SDK_KEY = "kdKDTP_RnAOH3L7pdoivJGEKCAsK5_eFm0GiTK_KZcf8h8dtJyXPGSn5MSLW10e570bECAauxbrTyFKTrTAmVZ"

    override val bannerConfig = AdNetworkConfig.Builder(
        AppLovinFactory.ID,
        AppLovinFactory.NAME
    )
        .credentials(mapOf(
            AppLovinFactory.SDK_KEY to SDK_KEY
        ))
        .build()
    override val bannerIABConfig: AdNetworkConfig
        get() = bannerConfig
    override val interstitialConfig: AdNetworkConfig
        get() = bannerConfig
    override val interstitialIABConfig: AdNetworkConfig
        get() = bannerConfig
    override val rewardedConfig: AdNetworkConfig
        get() = bannerConfig
    override val rewardedIABConfig: AdNetworkConfig
        get() = bannerConfig
}