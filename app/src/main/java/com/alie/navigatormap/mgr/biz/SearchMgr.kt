package com.alie.navigatormap.mgr.biz

import com.alie.navigatormap.mgr.bean.SearchReqParam

/**
 * Created by wen.tianyu on 2021/12/22.
 * 类描述 搜索相关管理者
 * 版本
 */
interface SearchMgr {

    /**
     * 关键字搜索
     */
    fun keywordSearch(searchReqParam: SearchReqParam, callback: () -> Unit)

    /**
     * 周边搜
     */
    fun aroundSearch(searchReqParam: SearchReqParam, callback: () -> Unit)

    /**
     * 详情搜
     */
    fun detailSearch(id: String, callback: () -> Unit)

    /**
     * 沿途搜（待定）
     */
    fun alongWaySearch(searchReqParam: SearchReqParam, callback: () -> Unit)

    /**
     * 逆地理搜索
     */
    fun nearestSearch(searchReqParam: SearchReqParam, callback: () -> Unit)
}