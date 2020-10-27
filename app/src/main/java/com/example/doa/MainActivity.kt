package com.example.doa

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE)

        //region Alert
        keluar.setOnClickListener{
            val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
            builder.setTitle("Keluar")
            builder.setIcon(R.drawable.notif_keluar)
            builder.setMessage("Apakah yakin untuk keluar?")
            builder.setPositiveButton("Ya"){
                dialog, which ->finish()
            }
            builder.setNegativeButton("Tidak"){dialog, which ->
                Toast.makeText(this, "Ayo lanjutkan menghafal doa", Toast.LENGTH_LONG).show()
            }
            val dialog:AlertDialog = builder.create()
            dialog.show()
        }
        //endregion

        quiz.setOnClickListener {

            //berpindah activity Intent(activity-saat-ini, activity-tujuan)
            val go = Intent(this@MainActivity, ContohFinalProjectKuis::class.java)

            //menjalankan intent
            startActivity(go)
        }

        doa.setOnClickListener {

            //berpindah activity Intent(activity-saat-ini, activity-tujuan)
            val go = Intent(this@MainActivity, MainActivity2::class.java)

            //menjalankan intent
            startActivity(go)
        }

        }

}