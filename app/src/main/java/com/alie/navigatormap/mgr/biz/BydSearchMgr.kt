package com.alie.navigatormap.mgr.biz

import com.alie.navigatormap.mgr.data.RespBody
import com.alie.navigatormap.mgr.data.search.CommonSearchResult
import com.alie.navigatormap.mgr.data.search.POISearch
import com.alie.navigatormap.mgr.data.search.SearchRequestParam
import com.alie.navigatormap.mgr.data.search.SearchResult

class BydSearchMgr:SearchMgr {
    override fun keywordSearch(
        searchRequestParam: SearchRequestParam,
        callback: (RespBody<CommonSearchResult<POISearch>>) -> Unit
    ) {
        TODO("Not yet implemented")
    }

    override fun aroundSearch(
        searchRequestParam: SearchRequestParam,
        callback: (RespBody<CommonSearchResult<POISearch>>) -> Unit
    ) {
        TODO("Not yet implemented")
    }

    override fun detailSearch(id: String, callback: (RespBody<SearchResult<POISearch>>) -> Unit) {
        TODO("Not yet implemented")
    }

    override fun nearestSearch(
        searchRequestParam: SearchRequestParam,
        callback: (RespBody<CommonSearchResult<POISearch>>) -> Unit
    ) {
        TODO("Not yet implemented")
    }

    override fun alongWaySearch() {
        TODO("Not yet implemented")
    }
}