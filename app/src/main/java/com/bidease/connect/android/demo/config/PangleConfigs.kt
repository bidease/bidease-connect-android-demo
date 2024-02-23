package com.bidease.config

import com.bidease.ads.adnetwork.pangle.PangleFactory
import com.bidease.ads.mediation.AdNetworkConfig

object PangleConfigs: TestConfigs {
    const val APP_ID = "8025677"

    override val bannerConfig = AdNetworkConfig.Builder(
        PangleFactory.ID,
        PangleFactory.NAME
    )
        .credentials(mapOf(
            PangleFactory.APP_ID to APP_ID,
            PangleFactory.SLOT_ID to "980099802"
        ))
        .build()
    override val bannerIABConfig = AdNetworkConfig.Builder(
        PangleFactory.ID,
        PangleFactory.NAME
    )
        .credentials(mapOf(
            PangleFactory.APP_ID to APP_ID,
            PangleFactory.SLOT_ID to "980099803"
        ))
        .build()
    override val interstitialConfig = AdNetworkConfig.Builder(
        PangleFactory.ID,
        PangleFactory.NAME
    )
        .credentials(mapOf(
            PangleFactory.APP_ID to APP_ID,
            PangleFactory.SLOT_ID to "980088188"
        ))
        .build()
    override val interstitialIABConfig = AdNetworkConfig.Builder(
        PangleFactory.ID,
        PangleFactory.NAME
    )
        .credentials(mapOf(
            PangleFactory.APP_ID to APP_ID,
            PangleFactory.SLOT_ID to "980088186"
        ))
        .build()
    override val rewardedConfig = AdNetworkConfig.Builder(
        PangleFactory.ID,
        PangleFactory.NAME
    )
        .credentials(mapOf(
            PangleFactory.APP_ID to APP_ID,
            PangleFactory.SLOT_ID to "980088192"
        ))
        .build()
    override val rewardedIABConfig = AdNetworkConfig.Builder(
        PangleFactory.ID,
        PangleFactory.NAME
    )
        .credentials(mapOf(
            PangleFactory.APP_ID to APP_ID,
            PangleFactory.SLOT_ID to "980088190"
        ))
        .build()
}