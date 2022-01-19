package com.alie.navigatormap.mgr.data.search

import com.alie.navigatormap.mgr.data.POICommon

/**
 * 基类搜索返回结果
 * @param P:POICommon
 * @property poiList List<P>
 */
interface SearchResult<P: POICommon> {
    val poiList:List<P>
}

/**
 * 常规搜索结果 （用来区分与沿途搜的结果）
 * @param P:POICommon
 */
interface CommonSearchResult<P:POICommon>:SearchResult<P> {
  val keyword:String
  val relevantCity:String
}