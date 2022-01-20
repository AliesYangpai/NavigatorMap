package com.alie.navigatormap.mgr

/**
 * 此接口用于封装 高德开发平台中原生控制类api
 * 比如，Amap类，AMapLocationClient 等，此处使用此类将 高德Api隔离开来。
 *
 */
interface ApiWrapper {
    fun<T> getMapController():T
}