package com.alie.navigatormap.mgr

import com.alie.navigatormap.mgr.common.LayerMgr
import com.alie.navigatormap.mgr.common.LocationMgr
import com.alie.navigatormap.mgr.common.SyncMgr

/**
 * Created by wen.tianyu on 2021/12/22.
 * 类描述 常规方向管理类
 * 版本
 */
interface CommonMgr {
    fun getSyncMgr(): SyncMgr // 数据同步经理，主要用于接口数据的同步
    fun getLocationMgr(): LocationMgr // 定位经理，主要用于获取定位数据
    fun getLayerMgr():LayerMgr // 图层经理，主要用于图层更新
}