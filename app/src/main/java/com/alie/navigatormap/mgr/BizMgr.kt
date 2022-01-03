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
    fun getMapMgr(): MapMgr // 主图业务
    fun getSearchMgr(): SearchMgr // 搜索业务
    fun getRouteMgr(): RouteMgr // 算路业务（暂不使用）
    fun getNaviMgr(): NaviMgr // 巡航导航业务（暂不使用）
    fun getConfigMgr():ConfigMgr // 主屏配置业务
}