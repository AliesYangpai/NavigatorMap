package com.alie.navigatormap.mgr

import com.alie.navigatormap.mgr.common.LayerMgr
import com.alie.navigatormap.mgr.common.LocationMgr
import com.alie.navigatormap.mgr.common.SyncMgr
import com.alie.navigatormap.mgr.common.VehicleMgr

/**
 * Created by wen.tianyu on 2021/12/22.
 * 类描述 常规方向管理类
 * 版本
 */
interface CommonMgr {
    /**
     * 获取数据同步经理，主要用于接口数据的同步
     * @return SyncMgr
     */
    fun getSyncMgr(): SyncMgr

    /**
     * 获取定位经理，主要用于获取定位数据
     * @return LocationMgr
     */
    fun getLocationMgr(): LocationMgr

    /**
     * 获取图层经理，主要用于图层更新
     * @return LayerMgr
     */
    fun getLayerMgr():LayerMgr // 图层经理，主要用于图层更新

    /**
     * 获取车身数据接口
     * @return VehicleMgr
     */
    fun getVehicleMgr():VehicleMgr
}