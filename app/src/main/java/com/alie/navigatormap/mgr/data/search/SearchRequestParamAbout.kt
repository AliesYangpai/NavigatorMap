package com.alie.navigatormap.mgr.data.search

import com.alie.navigatormap.mgr.data.GeoPoint
import java.io.Serializable

/**
 * 搜索请求参数 所有的搜索请 均使用此类
 *
 * @property keyword String
 * @property localPoint GeoPoint? 当前车辆的经纬度
 * @constructor
 */
data class SearchRequestParam(
    val keyword:String,
    val localPoint:GeoPoint? = null,
    val condition: SearchRequestCondition? = null
):Serializable

data class SearchRequestCondition(
    val adCode:String = "",
    val poiPoint: GeoPoint?= null,
    val page:Int = 1,
    val count:Int = 10,
    val range:Int = 5000,
):Serializable