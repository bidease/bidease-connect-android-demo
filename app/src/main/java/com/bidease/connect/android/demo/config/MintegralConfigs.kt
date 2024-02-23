package com.bidease.config

import com.bidease.ads.adnetwork.mintegral.MintegralFactory
import com.bidease.ads.mediation.AdNetworkConfig

object MintegralConfigs: TestConfigs {
    const val TEST_APP_KEY = "7c22942b749fe6a6e361b675e96b3ee9"
    const val TEST_APP_ID = "144002"

    override val bannerConfig = AdNetworkConfig.Builder(
        MintegralFactory.ID,
        MintegralFactory.NAME
    ).credentials(
        mapOf(
            MintegralFactory.APP_KEY to TEST_APP_KEY,
            MintegralFactory.APP_ID to TEST_APP_ID,
            MintegralFactory.PLACEMENT_ID to "1010694",
            MintegralFactory.AD_UNIT_ID to "2677210"
        )
    ).build()

    override val bannerIABConfig = AdNetworkConfig.Builder(
        MintegralFactory.ID_IAB,
        MintegralFactory.NAME_IAB
    ).credentials(
        mapOf(
            MintegralFactory.APP_KEY to TEST_APP_KEY,
            MintegralFactory.APP_ID to TEST_APP_ID,
            MintegralFactory.PLACEMENT_ID to "1010694",
            MintegralFactory.AD_UNIT_ID to "2677203"
        )
    ).build()

    override val interstitialConfig = AdNetworkConfig.Builder(
        MintegralFactory.ID,
        MintegralFactory.NAME
    ).credentials(
        mapOf(
            MintegralFactory.APP_KEY to TEST_APP_KEY,
            MintegralFactory.APP_ID to TEST_APP_ID,
            MintegralFactory.PLACEMENT_ID to "290653",
            MintegralFactory.AD_UNIT_ID to "462374"
        )
    ).build()

    override val interstitialIABConfig = AdNetworkConfig.Builder(
        MintegralFactory.ID_IAB,
        MintegralFactory.NAME_IAB
    ).credentials(
        mapOf(
            MintegralFactory.APP_KEY to TEST_APP_KEY,
            MintegralFactory.APP_ID to TEST_APP_ID,
            MintegralFactory.PLACEMENT_ID to "290653",
            MintegralFactory.AD_UNIT_ID to "1542103"
        )
    ).build()

    override val rewardedConfig = AdNetworkConfig.Builder(
        MintegralFactory.ID,
        MintegralFactory.NAME
    ).credentials(
        mapOf(
            MintegralFactory.APP_KEY to TEST_APP_KEY,
            MintegralFactory.APP_ID to TEST_APP_ID,
            MintegralFactory.PLACEMENT_ID to "290651",
            MintegralFactory.AD_UNIT_ID to "462372"
        )
    ).build()

    override val rewardedIABConfig = AdNetworkConfig.Builder(
        MintegralFactory.ID_IAB,
        MintegralFactory.NAME_IAB
    ).credentials(
        mapOf(
            MintegralFactory.APP_KEY to TEST_APP_KEY,
            MintegralFactory.APP_ID to TEST_APP_ID,
            MintegralFactory.PLACEMENT_ID to "290651",
            MintegralFactory.AD_UNIT_ID to "1542101"
        )
    ).build()
}