package com.alie.navigatormap.mgr

import com.alie.navigatormap.mgr.extra.BydTrackingMgr
import com.alie.navigatormap.mgr.extra.TrackingMgr

class BydExtraMgr : ExtraMgr {
    private val trackingMgr by lazy { BydTrackingMgr() }

    override fun getTrackingMgr(): TrackingMgr = trackingMgr
}