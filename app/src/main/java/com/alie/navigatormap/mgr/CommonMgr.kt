package com.alie.navigatormap.mgr

import com.alie.navigatormap.mgr.common.LocationMgr
import com.alie.navigatormap.mgr.common.SyncMgr

/**
 * Created by wen.tianyu on 2021/12/22.
 * 类描述 常规方向管理类
 * 版本
 */
interface CommonMgr {
    fun getSyncMgr(): SyncMgr
    fun getLocationMgr(): LocationMgr
}