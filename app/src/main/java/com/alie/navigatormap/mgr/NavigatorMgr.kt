package com.alie.navigatormap.mgr

/**
 * Created by wen.tianyu on 2021/12/22.
 * 类描述  副驾地图项目中所有业务的管理者
 * 版本
 */
interface NavigatorMgr {
    fun getBizMgr(): BizMgr // Biz业务管理者
    fun getCommonMgr(): CommonMgr // 常规功能管理
    fun getExtraMgr():ExtraMgr // 额外功能管理
}