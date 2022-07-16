package eu.darken.myperm.common.upgrade.core

import eu.darken.myperm.common.BuildConfigWrap
import eu.darken.myperm.common.upgrade.core.data.AvailableSku
import eu.darken.myperm.common.upgrade.core.data.Sku

enum class MyPermSku constructor(override val sku: Sku) : AvailableSku {
    PRO_UPGRADE(Sku("${BuildConfigWrap.APPLICATION_ID}.iap.upgrade.pro"))
}