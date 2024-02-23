package com.bidease.config

import com.bidease.ads.adnetwork.unity.UnityFactory
import com.bidease.ads.mediation.AdNetworkConfig

object UnityConfigs: TestConfigs {
    const val GAME_ID = "5503222"

    override val bannerConfig = AdNetworkConfig.Builder(UnityFactory.ID, UnityFactory.NAME)
        .credentials(mapOf(
            UnityFactory.GAME_ID to GAME_ID,
            UnityFactory.ZONE_ID to "Banner_Android"
        ))
        .build()
    override val bannerIABConfig: AdNetworkConfig
        get() = bannerConfig
    override val interstitialConfig = AdNetworkConfig.Builder(UnityFactory.ID, UnityFactory.NAME)
        .credentials(mapOf(
            UnityFactory.GAME_ID to GAME_ID,
            UnityFactory.ZONE_ID to "Interstitial_Android"
        ))
        .build()
    override val interstitialIABConfig: AdNetworkConfig
        get() = interstitialConfig
    override val rewardedConfig = AdNetworkConfig.Builder(UnityFactory.ID, UnityFactory.NAME)
        .credentials(mapOf(
            UnityFactory.GAME_ID to GAME_ID,
            UnityFactory.ZONE_ID to "Rewarded_Android"
        ))
        .build()
    override val rewardedIABConfig: AdNetworkConfig
        get() = rewardedConfig
}