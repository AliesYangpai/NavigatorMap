package com.alie.navigatormap.mgr

import com.alie.navigatormap.mgr.biz.MapMgr
import com.alie.navigatormap.mgr.biz.NaviMgr
import com.alie.navigatormap.mgr.biz.RouteMgr
import com.alie.navigatormap.mgr.biz.SearchMgr
import com.alie.navigatormap.mgr.biz.ConfigMgr

/**
 * Created by wen.tianyu on 2021/12/22.
 * 类描述 业务方向管理类
 * 版本
 */
interface BizMgr {
    fun getMapMgr(): MapMgr
    fun getSearchMgr(): SearchMgr
    fun getRouteMgr(): RouteMgr
    fun getNaviMgr(): NaviMgr
    fun getConfigMgr():ConfigMgr
}