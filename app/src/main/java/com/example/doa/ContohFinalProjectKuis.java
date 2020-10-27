package com.example.doa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;

public class ContohFinalProjectKuis extends AppCompatActivity {

    LinearLayout mlinePilGan, mLineEssay;	//variabel baru bertipe LinearLayout

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contoh_final_project_kuis);
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        //menyambungkan variabel pada MainActivity.java dengan id pada activity_main
        //pastikan tipe data variabel dengan view id sama
        mlinePilGan = (LinearLayout) findViewById(R.id.linePilGan);
        mLineEssay = (LinearLayout) findViewById(R.id.lineEssay);

        //memberi aksi ketika diklik
        mlinePilGan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //hasil aksinya ditulis disini (dalam method onClick)
                //pada kali ini hasil yang diinginkan adalah pindah activity, maka

                //membuat objek baru dari kelas intent,
                //dari MainActivity akan pindah ke KuisPilihaGanda
                Intent i = new Intent(ContohFinalProjectKuis.this, KuisPilihanGanda.class);
                startActivity(i); //jalankan Intent
            }
        });

        mLineEssay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //hasil aksinya ditulis disini (dalam method onClick)
                //pada kali ini hasil yang diinginkan adalah pindah activity, maka

                //membuat objek baru dari kelas intent,
                //dari MainActivity akan pindah ke KuisEssay
                Intent i = new Intent(ContohFinalProjectKuis.this, KuisEssay.class);
                startActivity(i);
            }
        });
    }

}