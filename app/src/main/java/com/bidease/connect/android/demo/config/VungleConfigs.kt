package com.bidease.config

import com.bidease.ads.adnetwork.vungle.VungleFactory
import com.bidease.ads.mediation.AdNetworkConfig

object VungleConfigs: TestConfigs {
    const val APP_ID = "65807eee785ffbb3b3ff3902"
    override val bannerConfig = AdNetworkConfig.Builder(VungleFactory.ID, VungleFactory.NAME)
        .credentials(mapOf(
            VungleFactory.APP_ID to APP_ID,
            VungleFactory.PLACEMENT_ID to "BANNER-9695094"
        ))
        .build()
    override val bannerIABConfig: AdNetworkConfig
        get() = bannerConfig
    override val interstitialConfig = AdNetworkConfig.Builder(VungleFactory.ID, VungleFactory.NAME)
        .credentials(mapOf(
            VungleFactory.APP_ID to APP_ID,
            VungleFactory.PLACEMENT_ID to "FULL-4735622"
        ))
        .build()
    override val interstitialIABConfig: AdNetworkConfig
        get() = interstitialConfig
    override val rewardedConfig = AdNetworkConfig.Builder(VungleFactory.ID, VungleFactory.NAME)
        .credentials(mapOf(
            VungleFactory.APP_ID to APP_ID,
            VungleFactory.PLACEMENT_ID to "REWARD-4525080"
        ))
        .build()
    override val rewardedIABConfig: AdNetworkConfig
        get() = rewardedConfig
}