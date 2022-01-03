package com.alie.navigatormap.mgr.common

import com.alie.navigatormap.mgr.common.layer.LocationLayer
import com.alie.navigatormap.mgr.common.layer.RouteLayer
import com.alie.navigatormap.mgr.common.layer.SearchLayer

/**
 * 图层相关接口
 * 涉及到图层更新，扎标等操作时，需要使用当前接口
 */
interface LayerMgr {
    fun getLocationLayer():LocationLayer // 位置图层
    fun getSearchLayer():SearchLayer// 搜索图层
    fun getRouteLayer():RouteLayer // 路线图层 （暂不实现）
    fun clear() // 清除全部
}