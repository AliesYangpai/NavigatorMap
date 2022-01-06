package com.alie.navigatormap.mgr

import com.alie.navigatormap.mgr.biz.MapMgr
import com.alie.navigatormap.mgr.biz.NaviMgr
import com.alie.navigatormap.mgr.biz.RouteMgr
import com.alie.navigatormap.mgr.biz.SearchMgr
import com.alie.navigatormap.mgr.biz.ConfigMgr

/**
 * Created by wen.tianyu on 2021/12/22.
 * 类描述 Biz业务经理
 * 版本
 */
interface BizMgr {

    /**
     * 获取主图业务经理
     * @return MapMgr
     */
    fun getMapMgr(): MapMgr

    /**
     * 获取搜索业务经理
     * @return SearchMgr
     */
    fun getSearchMgr(): SearchMgr // 搜索业务

    /**
     * 获取算路业务经理（暂不使用）
     * @return RouteMgr
     */
    fun getRouteMgr(): RouteMgr

    /**
     * 获取导航业务经理（暂不使用）
     * @return NaviMgr
     */
    fun getNaviMgr(): NaviMgr

    /**
     * 获取主屏配置业务经理 （暂不使用）
     * @return ConfigMgr
     */
    fun getConfigMgr():ConfigMgr
}