package com.alie.navigatormap.mgr

class BydNavigatorMgr : NavigatorMgr {

    private val bizMgr by lazy { BydBizMgr() }
    private val commonMgr by lazy { BydCommonMgr() }
    private val extraMgr by lazy { BydExtraMgr() }

    override fun <T : ApiWrapper> attach(wrapper: T) {
        TODO("Not yet implemented")
    }

    override fun detach() {
        TODO("Not yet implemented")
    }

    override fun destroy() {
        TODO("Not yet implemented")
    }

    override fun getBizMgr(): BizMgr = bizMgr
    override fun getCommonMgr(): CommonMgr = commonMgr
    override fun getExtraMgr(): ExtraMgr = extraMgr
}