package com.alie.navigatormap.mgr

/**
 * Created by wen.tianyu on 2021/12/22.
 * 类描述  副驾地图项目中所有业务的经理
 * 版本
 */
interface NavigatorMgr {

    /**
     * 关联
     */
    fun attach()

    /**
     * 取消关联
     */
    fun detach()

    /**
     * 销毁
     */
    fun destroy()

    /**
     * 获取Biz业务经理
     * @return BizMgr
     */
    fun getBizMgr(): BizMgr

    /**
     * 获取常规业务经理
     * @return CommonMgr
     */
    fun getCommonMgr(): CommonMgr

    /**
     * 获取额外业务经理
     * @return ExtraMgr
     */
    fun getExtraMgr():ExtraMgr
}