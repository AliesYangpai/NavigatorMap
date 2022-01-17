package com.alie.navigatormap

import android.app.Application
import com.amap.api.maps.MapsInitializer

class NavigatorApp:Application() {
    override fun onCreate() {
        super.onCreate()
        MapsInitializer.updatePrivacyShow(this,true,true)
        MapsInitializer.updatePrivacyAgree(this,true)
    }
}