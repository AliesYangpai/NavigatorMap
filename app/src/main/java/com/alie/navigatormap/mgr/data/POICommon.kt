package com.alie.navigatormap.mgr.data


/**
 * 常规poi信息
 *
 * @property parentId String
 * @property address String
 * @property district String 区域
 * @property category String
 * @property adCode String
 * @property label String  标签
 * @property description String 描述
 * @property extendInfo String 拓展信息
 * @property tel String
 * @property distance String
 * @property naviPoint GeoPoint?
 * @property exitPoint GeoPoint?
 */
interface POICommon : MapLabel {
    val parentId: String
    val address: String
    val district:String
    val category: String
    val adCode:String
    val label: String
    val description: String
    val extendInfo:String
    val tel:String
    val distance:String
    val naviPoint:GeoPoint?
    val exitPoint:GeoPoint?
}