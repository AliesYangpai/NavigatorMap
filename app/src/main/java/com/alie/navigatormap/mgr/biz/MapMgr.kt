package com.alie.navigatormap.mgr.biz

/**
 * Created by wen.tianyu on 2021/12/22.
 * 主图相关管理者，用于主图操作。扎标相关操作 可考虑用于此处
 * 版本
 */
interface MapMgr {

    fun updateCenter() // 更新中心点
    fun updateMapMode() // 更新地图显示模式 如 卫星地图、基本地图，地图
    fun updateTraffic() // 变更路况
    fun updateCarLabel() // 更新车标
    fun zoomIn() // 放大
    fun zoomOut() // 缩小
}