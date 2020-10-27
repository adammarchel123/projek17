package com.example.doa;

public class SoalEssay {
    //membuat array untuk pertanyaan
    public String pertanyaan[] = {
            "Doa diatas dibaca sebelum ?",
            "Doa diatas diucapkan sesudah?",
            "Doa diatas dibaca sebelum?",
            "Doa diatas diucapkan ketika ?",
            "Doa diatas diucapkan ketika masuk?",
            "Doa diatas diucapkan ketika keluar dari?",
            "Doa diatas diucapkan ketika hendak?",
            "Doa diatas diucapkan ketika keluar dari?",
            "Doa diatas dibaca sebelum memulai?",
    };

    //membuat array untuk set gambar (dari String diubah jadi ImageView)
    //pastikan yang tertulis disini sama dengan nama di drawable
    //lihat gambar penjelasan1
    private String image[] = {
            "soal1",
            "soal2",
            "soal3",
            "soal4",
            "soal5",
            "soal6",
            "soal7",
            "soal8",
            "soal9",
    };

    //membuat array jawaban benar
    private String jawabanBenar[] = {
            "makan",
            "makan",
            "tidur",
            "bangun tidur",
            "kamar mandi",
            "rumah",
            "bercermin",
            "kamar mandi",
            "belajar",
    };

    //membuat getter untuk mengambil pertanyaan
    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getStringGambar(int x){
        String gambar = image[x];
        return gambar;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}
