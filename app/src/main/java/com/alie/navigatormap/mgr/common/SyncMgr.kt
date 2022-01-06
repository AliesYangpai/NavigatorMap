package com.alie.navigatormap.mgr.common

/**
 * Created by wen.tianyu on 2021/12/22.
 * 数据同步管理
 * 用于和主屏进行数据同步
 */
interface SyncMgr {

    /**
     * 初始化
     */
    fun init()

    /**
     * 连接
     */
    fun connect()

    /**
     * 断开连接
     */
    fun disConnect()

    /**
     * 销毁
     */
    fun destroy()

    /**
     * 获取主屏状态
     */
    fun getDriverStatus()

    /**
     * 添加POI发送记录
     */
    fun addSendPoiHistory()

    /**
     * 删poi发送记录
     */
    fun delSendPoiHistory()

    /**
     * 获取发送记录
     */
    fun getSendPoiHistory()

    /**
     * 清楚发送记录
     */
    fun clearSendPoiHistory()
}