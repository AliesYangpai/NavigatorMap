package com.alie.navigatormap.mgr.biz

/**
 * Created by wen.tianyu on 2021/12/22.
 * 类描述 搜索相关管理者
 * 版本
 */
interface SearchMgr {
    fun keywordSearch()
    fun aroundSearch()
    fun detailSearch()
    fun alongWaySearch()
    fun nearestSearch()
    fun addSearchHistory()
    fun delSearchHistory()
    fun getSearchHistory()
    fun clearSearchHistory()
}