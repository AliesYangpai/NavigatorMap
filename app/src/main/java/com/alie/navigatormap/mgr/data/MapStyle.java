package com.alie.navigatormap.mgr.data;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
        MapStyle.DAY,
        MapStyle.NIGHT
})
@Retention(RetentionPolicy.SOURCE)
public @interface MapStyle {
    int DAY = 1;
    int NIGHT = 2;
}
