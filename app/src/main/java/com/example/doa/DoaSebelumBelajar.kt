package com.example.doa

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import kotlinx.android.synthetic.main.activity_doa_sebelum_tidur.*

class DoaSebelumBelajar : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer
    private lateinit var runnable:Runnable
    private var handler: Handler = Handler()
    private var pause:Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa_sebelum_belajar)
        next.setOnClickListener {
            //berpindah activity Intent(activity-saat-ini, activity-tujuan)
            val go = Intent(this@DoaSebelumBelajar , DoaSebelumBelajar::class.java)
            //menjalankan intent
            startActivity(go)
        }
        back.setOnClickListener {
            //berpindah activity Intent(activity-saat-ini, activity-tujuan)
            val go = Intent(this@DoaSebelumBelajar , DoaNaikKendaraan::class.java)
            //menjalankan intent
            startActivity(go)
        }
        home3.setOnClickListener {
            //berpindah activity Intent(activity-saat-ini, activity-tujuan)
            val go = Intent(this@DoaSebelumBelajar , MainActivity2::class.java)
            //menjalankan intent
            startActivity(go)
        }


        // Start the media player
        playBtn.setOnClickListener{
            if(pause){
                mediaPlayer.seekTo(mediaPlayer.currentPosition)
                mediaPlayer.start()
                pause = false
                Toast.makeText(this,"media playing", Toast.LENGTH_SHORT).show()
            }else{

                mediaPlayer = MediaPlayer.create(applicationContext,R.raw.doa_sebelum_belajar)
                mediaPlayer.start()
                Toast.makeText(this,"media playing", Toast.LENGTH_SHORT).show()

            }

            playBtn.isEnabled = false
            pauseBtn.isEnabled = true
            stopBtn.isEnabled = true


            mediaPlayer.setOnCompletionListener {
                playBtn.isEnabled = true
                pauseBtn.isEnabled = false
                stopBtn.isEnabled = false
                Toast.makeText(this,"end", Toast.LENGTH_SHORT).show()
            }
        }
        // Pause the media player
        pauseBtn.setOnClickListener {
            if(mediaPlayer.isPlaying){
                mediaPlayer.pause()
                pause = true
                playBtn.isEnabled = true
                pauseBtn.isEnabled = false
                stopBtn.isEnabled = true
                Toast.makeText(this,"media pause", Toast.LENGTH_SHORT).show()
            }
        }
        // Stop the media player
        stopBtn.setOnClickListener{
            if(mediaPlayer.isPlaying || pause.equals(true)){
                pause = false
                seek_bar.setProgress(0)
                mediaPlayer.stop()
                mediaPlayer.reset()
                mediaPlayer.release()
                handler.removeCallbacks(runnable)

                playBtn.isEnabled = true
                pauseBtn.isEnabled = false
                stopBtn.isEnabled = false
                Toast.makeText(this,"media stop", Toast.LENGTH_SHORT).show()
            }
        }







        val imageSlider = findViewById<ImageSlider>(R.id.slider)
        val imageList: ArrayList<SlideModel> = ArrayList()


        imageList.add(SlideModel(R.drawable.baca_arab, ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.baca_latin, ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.baca_idn, ScaleTypes.FIT))
        imageSlider.setImageList(imageList)
    }
}