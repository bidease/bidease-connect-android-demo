package com.bidease.config

import com.bidease.ads.adnetwork.chartboost.ChartboostFactory
import com.bidease.ads.mediation.AdNetworkConfig

object ChartboostConfigs: TestConfigs {
    const val APP_ID = "6580738d336886ede0ea702b"
    override val bannerConfig = AdNetworkConfig.Builder(
        ChartboostFactory.ID,
        ChartboostFactory.NAME
    )
        .credentials(mapOf(
            ChartboostFactory.APP_ID to APP_ID,
            ChartboostFactory.APP_SIGNATURE to "8539ecbda1bc6a5c02bd5b25c4a6ca2f33319b0a"
        ))
        .build()
    override val bannerIABConfig: AdNetworkConfig
        get() = bannerConfig
    override val interstitialConfig = AdNetworkConfig.Builder(
        ChartboostFactory.ID,
        ChartboostFactory.NAME
    )
        .credentials(mapOf(
            ChartboostFactory.APP_ID to APP_ID,
            ChartboostFactory.APP_SIGNATURE to "8539ecbda1bc6a5c02bd5b25c4a6ca2f33319b0a"
        ))
        .build()
    override val interstitialIABConfig: AdNetworkConfig
        get() = interstitialConfig
    override val rewardedConfig = AdNetworkConfig.Builder(
        ChartboostFactory.ID,
        ChartboostFactory.NAME
    )
        .credentials(mapOf(
            ChartboostFactory.APP_ID to APP_ID,
            ChartboostFactory.APP_SIGNATURE to "8539ecbda1bc6a5c02bd5b25c4a6ca2f33319b0a"
        ))
        .build()
    override val rewardedIABConfig: AdNetworkConfig
        get() = rewardedConfig
}