package com.alie.navigatormap.mgr.biz

/**
 * Created by wen.tianyu on 2021/12/22.
 * 类描述 搜索相关管理者
 * 版本
 */
interface SearchMgr {

    /**
     * 关键字搜索
     */
    fun keywordSearch()

    /**
     * 周边搜
     */
    fun aroundSearch()

    /**
     * 详情搜
     */
    fun detailSearch()

    /**
     * 沿途搜（待定）
     */
    fun alongWaySearch()

    /**
     * 逆地理搜索
     */
    fun nearestSearch()
}