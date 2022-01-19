package com.alie.navigatormap.mgr.data

/**
 * 通用相应体
 * @param T
 * @property code Int
 * @property msg String?
 * @constructor
 */
open class RespBody<T>(val code:Int = RespCode.UNKNOWN,val msg:String? = null,data:T?)