package com.alie.navigatormap.mgr.biz

import com.alie.navigatormap.mgr.ApiWrapper
import com.amap.api.maps.AMap
import com.amap.api.maps.CameraUpdateFactory
import com.autonavi.ae.route.GeoPoint

class BydMapMgr(val apiWrapper: ApiWrapper?) : MapMgr {
    override fun updateCenter(geoPoint: GeoPoint) {
    }

    override fun updateMapMode(status: Boolean) =
        when (status) {
            true -> apiWrapper?.getMapController<AMap>()?.mapType = AMap.MAP_TYPE_NAVI
            else -> apiWrapper?.getMapController<AMap>()?.mapType = AMap.MAP_TYPE_NIGHT
        }


    override fun updateTraffic(status: Boolean) {
        apiWrapper?.getMapController<AMap>()?.isTrafficEnabled = status
    }

    override fun zoomIn() {
        apiWrapper?.getMapController<AMap>()?.animateCamera(CameraUpdateFactory.zoomIn(), 700, null)
    }

    override fun zoomOut() {
        apiWrapper?.getMapController<AMap>()
            ?.animateCamera(CameraUpdateFactory.zoomOut(), 700, null)
    }

    override fun getScale(): Float {
        TODO("Not yet implemented")
    }
}