package com.alie.navigatormap.mgr.biz

import com.autonavi.ae.route.GeoPoint


/**
 * Created by wen.tianyu on 2021/12/22.
 * 主图相关管理者，用于主图操作
 * 版本
 */
interface MapMgr {

    /**
     * 更新地图中心点
     */
    fun updateCenter(geoPoint: GeoPoint)

    /**
     * 更新地图样式，白天/黑夜
     */
    fun updateMapMode(status: Boolean)

    /**
     * 变更路况
     * @param status Boolean true 开启 false 关闭
     */
    fun updateTraffic(status: Boolean)

    /**
     * 放大
     */
    fun zoomIn()

    /**
     * 缩小
     */
    fun zoomOut()

    /**
     * 获取缩放比例
     * @return Float
     */
    fun getScale():Float
}