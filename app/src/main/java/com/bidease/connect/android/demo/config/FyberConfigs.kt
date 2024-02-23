package com.bidease.config

import com.bidease.ads.adnetwork.fyber.FyberFactory
import com.bidease.ads.mediation.AdNetworkConfig

object FyberConfigs: TestConfigs {
    const val APP_ID = "170353"

    override val bannerConfig = AdNetworkConfig.Builder(
        FyberFactory.ID,
        FyberFactory.NAME
    )
        .credentials(mapOf(
            FyberFactory.APP_ID to APP_ID,
            FyberFactory.PLACEMENT_ID to "1809391"
        ))
        .build()
    override val bannerIABConfig: AdNetworkConfig
        get() = bannerConfig
    override val interstitialConfig = AdNetworkConfig.Builder(
        FyberFactory.ID,
        FyberFactory.NAME
    )
        .credentials(mapOf(
            FyberFactory.APP_ID to APP_ID,
            FyberFactory.PLACEMENT_ID to "1809390"
        ))
        .build()
    override val interstitialIABConfig: AdNetworkConfig
        get() = interstitialConfig
    override val rewardedConfig = AdNetworkConfig.Builder(
        FyberFactory.ID,
        FyberFactory.NAME
    )
        .credentials(mapOf(
            FyberFactory.APP_ID to APP_ID,
            FyberFactory.PLACEMENT_ID to "1809389"
        ))
        .build()
    override val rewardedIABConfig: AdNetworkConfig
        get() = rewardedConfig
}