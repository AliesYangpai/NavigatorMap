package com.alie.navigatormap.mgr

class BydNavigatorMgr : NavigatorMgr {

    private var apiWrapper: ApiWrapper? = null
    private val bizMgr by lazy { BydBizMgr(apiWrapper) }
    private val commonMgr by lazy { BydCommonMgr() }
    private val extraMgr by lazy { BydExtraMgr() }


    override fun <T : ApiWrapper> attach(wrapper: T) {
        apiWrapper = wrapper
    }


    override fun detach() {
        apiWrapper = null
    }

    override fun destroy() {
        TODO("Not yet implemented")
    }

    override fun getBizMgr(): BizMgr = bizMgr
    override fun getCommonMgr(): CommonMgr = commonMgr
    override fun getExtraMgr(): ExtraMgr = extraMgr
}