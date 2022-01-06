package com.alie.navigatormap.mgr.common

import com.alie.navigatormap.mgr.common.layer.LocationLayer
import com.alie.navigatormap.mgr.common.layer.RouteLayer
import com.alie.navigatormap.mgr.common.layer.SearchLayer

/**
 * 图层经理
 * 涉及到图层更新，扎标等操作时，需要使用当前接口
 */
interface LayerMgr {
    /**
     * 获取位置图层（与车标共用）
     * @return LocationLayer
     */
    fun getLocationLayer():LocationLayer

    /**
     * 获取搜索图层
     * @return SearchLayer
     */
    fun getSearchLayer():SearchLayer// 搜索图层

    /**
     * 获取路线图层（暂不实现）
     * @return RouteLayer
     */
    fun getRouteLayer():RouteLayer

    /**
     * 清楚全部
     */
    fun clear() // 清除全部
}