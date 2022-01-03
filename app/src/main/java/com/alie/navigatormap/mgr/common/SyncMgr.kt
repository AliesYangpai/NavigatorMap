package com.alie.navigatormap.mgr.common

/**
 * Created by wen.tianyu on 2021/12/22.
 * 数据同步管理
 * 用于和主屏进行数据同步
 */
interface SyncMgr {
    fun init()
    fun connect()
    fun disConnect()
    fun destroy()

    fun addOperateHistory()
    fun delOperateHistory()
    fun getOperateHistory()
    fun clearOperateHistory()
}