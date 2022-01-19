package com.alie.navigatormap.mgr.biz

import com.alie.navigatormap.mgr.data.RespBody
import com.alie.navigatormap.mgr.data.search.CommonSearchResult
import com.alie.navigatormap.mgr.data.search.POISearch
import com.alie.navigatormap.mgr.data.search.SearchRequestParam
import com.alie.navigatormap.mgr.data.search.SearchResult


/**
 * Created by wen.tianyu on 2021/12/22.
 * 类描述 搜索相关管理者
 * 版本
 */
interface SearchMgr {

    /**
     * 关键字搜索
     */
    fun keywordSearch(
        searchRequestParam: SearchRequestParam,
        callback: (RespBody<CommonSearchResult<POISearch>>) -> Unit
    )

    /**
     * 周边搜
     */
    fun aroundSearch(
        searchRequestParam: SearchRequestParam,
        callback: (RespBody<CommonSearchResult<POISearch>>) -> Unit
    )

    /**
     * 详情搜
     */
    fun detailSearch(
        id: String,
        callback: (RespBody<SearchResult<POISearch>>) -> Unit
    )

    /**
     * 逆地理搜索
     */
    fun nearestSearch(
        searchRequestParam: SearchRequestParam,
        callback: (RespBody<CommonSearchResult<POISearch>>) -> Unit
    )

    /**
     * 沿途搜（待定）
     */
    fun alongWaySearch()
}