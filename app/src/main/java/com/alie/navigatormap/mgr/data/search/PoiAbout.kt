package com.alie.navigatormap.mgr.data.search

import com.alie.navigatormap.mgr.data.POICommon
import java.io.Serializable


/**
 * 搜索结果poi
 * @property distance String
 */
interface POISearch: POICommon {
    val park:Park?
    val charge:Charge?
    val subPoiList:List<POICommon>
    val gasList:List<Gas>
}

/**
 * 停车场信息
 *
 * @property type String  停车场类型
 * @property rates String 收费标准
 * @property freeSpace String 空车位
 * @property sumSpace String 总车位
 */
interface Park:Serializable {
    val type:String
    val rates:String
    val freeSpace:String
    val sumSpace:String
}

/**
 * 加油站信息
 * @property price String 价格
 * @property brand String 品牌
 * @property label String 标签 92# 95# 柴油 等
 */
interface Gas:Serializable {
    val label:String
    val brand:String
    val price:String
}

/**
 * 充电站信息
 * @property chargePrice String
 * @property parkPrice String
 * @property fastChargeNum String
 * @property slowChargeNum String
 * @property description String
 */
interface Charge:Serializable {
    val chargePrice:String
    val parkPrice:String
    val fastChargeNum:String
    val slowChargeNum:String
    val description:String
}

/**
 * 城市信息
 */
interface City:POICommon