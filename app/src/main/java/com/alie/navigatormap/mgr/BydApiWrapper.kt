package com.alie.navigatormap.mgr

import com.amap.api.maps.AMap

/**
 * 用来封装 第三方目标接口
 * @property aMap AMap?
 */
class BydApiWrapper :ApiWrapper {
    var aMap:AMap? = null
    override fun <T> getMapController(): T {
        return aMap as T
    }
}