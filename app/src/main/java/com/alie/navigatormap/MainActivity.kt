package com.alie.navigatormap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alie.navigatormap.databinding.ActivityMainBinding
import com.amap.api.maps.AMap
import com.amap.api.maps.model.MyLocationStyle

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var mapController:AMap
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.mapView.onCreate(savedInstanceState)
        mapController = binding.mapView.map
        initShowPosition()
        initListener()
    }


    override fun onResume() {
        super.onResume()
        binding.mapView.onResume()
    }

    private fun initShowPosition() {
        mapController.myLocationStyle = MyLocationStyle().myLocationType(MyLocationStyle.LOCATION_TYPE_FOLLOW_NO_CENTER)
            .interval(4000).showMyLocation(true)


        mapController.isMyLocationEnabled = true
        showLocation()
    }



    private fun showLocation() {
        mapController.setOnMyLocationChangeListener {
//            println("===lon ${it?.longitude} lat:${it?.latitude} ")
            println("===lon ${mapController.myLocation?.longitude} lat:${mapController.myLocation?.latitude}")
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding.mapView.onDestroy()
    }

    private fun initListener() {
        binding.cbMapMode.setOnCheckedChangeListener { buttonView, isChecked ->
            println(" 白天黑夜:isCheck:$isChecked")
        }
        binding.cbTraffic.setOnCheckedChangeListener { buttonView, isChecked ->
            println(" 路况开关:isCheck:$isChecked")
        }
        binding.btnZoomIn.setOnClickListener {
            println("===放大")
        }
        binding.btnZoomOut.setOnClickListener {
            println("===缩小")
        }
        binding.btnBackToCar.setOnClickListener {
            println("===回车位")
        }
    }

}