package com.alie.navigatormap.mgr.data.search;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 搜索的业务返回码
 */
@IntDef({
        SearchRespCode.SUCCESS,
        SearchRespCode.FAILURE,
        SearchRespCode.TIME_OUT,
        SearchRespCode.CANCEL,
        SearchRespCode.NO_DATA
})

@Retention(RetentionPolicy.SOURCE)
public @interface SearchRespCode {
    int SUCCESS = 0;
    int FAILURE = 100001;
    int TIME_OUT = 100002;
    int CANCEL = 100003;
    int NO_DATA = 100004;
}
