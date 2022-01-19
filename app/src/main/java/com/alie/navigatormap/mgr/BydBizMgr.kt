package com.alie.navigatormap.mgr

import com.alie.navigatormap.mgr.biz.*

class BydBizMgr : BizMgr {
    private val mapMgr by lazy { BydMapMgr() }
    private val searchMgr by lazy { BydSearchMgr() }
    private val routeMgr by lazy { BydRouteMgr() }
    private val naviMgr by lazy { BydNaviMgr() }
    private val configMgr by lazy { BydConfigMgr() }

    override fun getMapMgr(): MapMgr = mapMgr

    override fun getSearchMgr(): SearchMgr = searchMgr

    override fun getRouteMgr(): RouteMgr = routeMgr

    override fun getNaviMgr(): NaviMgr = naviMgr

    override fun getConfigMgr(): ConfigMgr = configMgr
}