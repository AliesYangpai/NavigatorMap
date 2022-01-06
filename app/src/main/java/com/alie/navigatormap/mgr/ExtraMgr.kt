package com.alie.navigatormap.mgr

import com.alie.navigatormap.mgr.extra.TrackingMgr

/**
 * 额外功能管理者
 * 用于管理与基本业务之外的其他功能，比如数据埋点
 */
interface ExtraMgr {
    /**
     * 获取埋点管理者
     * （暂不使用）
     * @return TrackingMgr
     */
    fun getTrackingMgr(): TrackingMgr
}