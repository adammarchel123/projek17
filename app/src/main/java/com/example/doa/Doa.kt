package com.example.doa

import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import java.util.*
import kotlin.collections.ArrayList

class Doa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE)

//        val imageSlider = findViewById<ImageSlider>(R.id.slider)
//        val imageList: ArrayList<SlideModel> = ArrayList()
//
//
//        imageList.add(SlideModel(R.drawable.gambar1,ScaleTypes.FIT))
//        imageList.add(SlideModel(R.drawable.gambar2,ScaleTypes.FIT))
//        imageList.add(SlideModel(R.drawable.gambar3,ScaleTypes.FIT))
//        imageList.add(SlideModel(R.drawable.gambar4,ScaleTypes.FIT))
//        imageList.add(SlideModel(R.drawable.gambar5,ScaleTypes.FIT))
//        imageList.add(SlideModel(R.drawable.gambar6,ScaleTypes.FIT))
//        imageList.add(SlideModel(R.drawable.gambar7,ScaleTypes.FIT))
//        imageList.add(SlideModel(R.drawable.gambar8,ScaleTypes.FIT))
//        imageList.add(SlideModel(R.drawable.gambar9,ScaleTypes.FIT))
//        imageSlider.setImageList(imageList)

    }
}