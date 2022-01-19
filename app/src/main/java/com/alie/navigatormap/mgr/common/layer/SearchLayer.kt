package com.alie.navigatormap.mgr.common.layer

import com.alie.navigatormap.mgr.data.search.CommonSearchResult
import com.alie.navigatormap.mgr.data.search.POISearch

/**
 * 搜索图层
 */
interface SearchLayer {

    /**
     * 更新搜索结果
     */
    fun updateSearchResult(result:CommonSearchResult<POISearch>)

    /**
     * 清除
     */
    fun clear()
}