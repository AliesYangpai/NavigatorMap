package com.alie.navigatormap.mgr.data

import java.io.Serializable

/**
 * 点经纬度
 */
data class GeoPoint(
    var latitude: Double = 0.0,
    var longitude: Double = 0.0,
    var altitude: Double = 0.0
) : Serializable


