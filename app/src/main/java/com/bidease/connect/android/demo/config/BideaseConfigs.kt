package com.bidease.config

import com.bidease.ads.adnetwork.bidease.BideaseFactory
import com.bidease.ads.mediation.AdNetworkConfig

object BideaseConfigs: TestConfigs {
    override val bannerConfig = AdNetworkConfig.Builder(
        BideaseFactory.ID,
        BideaseFactory.NAME
    ).build()
    override val bannerIABConfig = AdNetworkConfig.Builder(
        BideaseFactory.ID_IAB,
        BideaseFactory.NAME_IAB
    ).build()
    override val interstitialConfig = AdNetworkConfig.Builder(
        BideaseFactory.ID,
        BideaseFactory.NAME
    ).build()
    override val interstitialIABConfig = AdNetworkConfig.Builder(
        BideaseFactory.ID_IAB,
        BideaseFactory.NAME_IAB
    ).build()
    override val rewardedConfig = AdNetworkConfig.Builder(
        BideaseFactory.ID,
        BideaseFactory.NAME
    ).build()
    override val rewardedIABConfig = AdNetworkConfig.Builder(
        BideaseFactory.ID_IAB,
        BideaseFactory.NAME_IAB
    ).build()
}