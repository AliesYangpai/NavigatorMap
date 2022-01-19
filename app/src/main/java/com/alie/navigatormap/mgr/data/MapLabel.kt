package com.alie.navigatormap.mgr.data

/**
 * 地图标签
 */
interface MapLabel {
    /**
     * 唯一标识
     */
    val id:String

    /**
     * 名称
     */
    val name:String

    /**
     * 经纬度
     */
    val geoPoint:GeoPoint
}