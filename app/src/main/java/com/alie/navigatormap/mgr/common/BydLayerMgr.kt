package com.alie.navigatormap.mgr.common

import com.alie.navigatormap.mgr.common.layer.*

class BydLayerMgr : LayerMgr {
    private val locationLayer by lazy { BydLocationLayer() }
    private val searchLayer by lazy { BydSearchLayer() }
    private val routeLayer by lazy { BydRouteLayer() }

    override fun getLocationLayer(): LocationLayer = locationLayer

    override fun getSearchLayer(): SearchLayer = searchLayer

    override fun getRouteLayer(): RouteLayer = routeLayer

    override fun clear() {
        TODO("Not yet implemented")
    }

}