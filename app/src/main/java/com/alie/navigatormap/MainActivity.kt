package com.alie.navigatormap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import com.alie.navigatormap.databinding.ActivityMainBinding
import com.amap.api.maps.model.MyLocationStyle

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.mapView.onCreate(savedInstanceState)
        initLocation()
    }


    private fun initLocation() {
        binding.mapView.map.myLocationStyle = MyLocationStyle().myLocationType(MyLocationStyle.LOCATION_TYPE_FOLLOW)
            .interval(2000).showMyLocation(true)
        binding.mapView.map.isMyLocationEnabled = true
    }

}