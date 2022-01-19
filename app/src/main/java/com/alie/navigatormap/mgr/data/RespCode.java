package com.alie.navigatormap.mgr.data;


import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 通用返回码
 */
@IntDef({RespCode.SUCCESS,
        RespCode.CANCEL,
        RespCode.FAILURE,
        RespCode.TIMEOUT,
        RespCode.UNKNOWN})
@Retention(RetentionPolicy.SOURCE)
public @interface RespCode {
    /**
     * 成功
     */
    int SUCCESS = 0;

    /**
     * 取消
     */
    int CANCEL = 900001;

    /**
     * 失败
     */
    int FAILURE = 900002;

    /**
     * 超时
     */
    int TIMEOUT = 900003;

    /**
     * 未知
     */
    int UNKNOWN = 900004;
}
