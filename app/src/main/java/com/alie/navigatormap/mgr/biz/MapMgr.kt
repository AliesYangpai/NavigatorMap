package com.alie.navigatormap.mgr.biz

/**
 * Created by wen.tianyu on 2021/12/22.
 * 主图相关管理者，用于主图操作
 * 版本
 */
interface MapMgr {

    /**
     * 更新地图中心点
     */
    fun updateCenter()

    /**
     * 更新地图显示模式 如 卫星地图、基本地图，地图
     */
    fun updateMapMode()

    /**
     * 变更路况
     */
    fun updateTraffic()

    /**
     * 放大
     */
    fun zoomIn()

    /**
     * 缩小
     */
    fun zoomOut()
}