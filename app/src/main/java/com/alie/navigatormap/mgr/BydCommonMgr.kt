package com.alie.navigatormap.mgr

import com.alie.navigatormap.mgr.common.*

class BydCommonMgr : CommonMgr {
    private val syncMgr by lazy { BydSyncMgr() }
    private val locationMgr by lazy { BydLocationMgr() }
    private val layerMgr by lazy { BydLayerMgr() }
    private val vehicleMgr by lazy { BydVehicleMgr() }
    override fun getSyncMgr(): SyncMgr = syncMgr

    override fun getLocationMgr(): LocationMgr = locationMgr

    override fun getLayerMgr(): LayerMgr = layerMgr

    override fun getVehicleMgr(): VehicleMgr = vehicleMgr
}