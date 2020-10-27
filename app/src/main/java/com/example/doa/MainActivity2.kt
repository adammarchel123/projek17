package com.example.doa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)

        pap1.setOnClickListener {
            //berpindah activity Intent(activity-saat-ini, activity-tujuan)
            val go = Intent(this@MainActivity2, DoaSebelumTidur::class.java)
            //menjalankan intent
            startActivity(go)
        }
        pap2.setOnClickListener {
            //berpindah activity Intent(activity-saat-ini, activity-tujuan)
            val go = Intent(this@MainActivity2, DoaBangunTidur::class.java)
            //menjalankan intent
            startActivity(go)
        }
        pap3.setOnClickListener {
            //berpindah activity Intent(activity-saat-ini, activity-tujuan)
            val go = Intent(this@MainActivity2, DoaUntukKeduaOrangtua::class.java)
            //menjalankan intent
            startActivity(go)
        }
        pap4.setOnClickListener {
            //berpindah activity Intent(activity-saat-ini, activity-tujuan)
            val go = Intent(this@MainActivity2, DoaKeluarRumah::class.java)
            //menjalankan intent
            startActivity(go)
        }
        pap5.setOnClickListener {
            //berpindah activity Intent(activity-saat-ini, activity-tujuan)
            val go = Intent(this@MainActivity2, DoaNaikKendaraan::class.java)
            //menjalankan intent
            startActivity(go)
        }
        pap6.setOnClickListener {
            //berpindah activity Intent(activity-saat-ini, activity-tujuan)
            val go = Intent(this@MainActivity2, DoaMasukRumah::class.java)
            //menjalankan intent
            startActivity(go)
        }
        pap7.setOnClickListener {
            //berpindah activity Intent(activity-saat-ini, activity-tujuan)
            val go = Intent(this@MainActivity2, DoaSebelumBelajar::class.java)
            //menjalankan intent
            startActivity(go)
        }
        pap8.setOnClickListener {
            //berpindah activity Intent(activity-saat-ini, activity-tujuan)
            val go = Intent(this@MainActivity2, DoaMemakaiPakaian::class.java)
            //menjalankan intent
            startActivity(go)
        }
        pap9.setOnClickListener {
            //berpindah activity Intent(activity-saat-ini, activity-tujuan)
            val go = Intent(this@MainActivity2, DoaTerkenaMusibah::class.java)
            //menjalankan intent
            startActivity(go)
        }
        home4.setOnClickListener {
            //berpindah activity Intent(activity-saat-ini, activity-tujuan)
            val go = Intent(this@MainActivity2, MainActivity::class.java)
            //menjalankan intent
            startActivity(go)
        }
    }
}