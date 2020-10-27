package com.example.doa;

public class SoalPilihanGanda {

    //membuat array untuk pertanyaan
    public String pertanyaan[] = {
            "Doa tersebut اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّار adalah doa?",
            "Doa tersebut بِسْمِكَ اللّهُمَّ اَحْيَا وَ بِسْمِكَ اَمُوْتُ adalah doa ?",
            "Doa tersebut الْحَمْدُ لِلَّهِ الَّذِي أَحْيَانَا بَعْدَ مَا أَمَاتَنَا وَإِلَيْهِ النُّشُورُ adalah doa ?",
            "Doa tersebut اللَّهُمَّ إِنِّي أَعُوذُ بِكَ مِنَ الخُبُثِ وَالخَبَائِثِ adalah doa ?",
            "Sambungan doa ...اَللَّهُمَّ كَمَا حَسَّنْتَ yang tepat adalah ?",
            "Sambungan doa ...رَبِّ زِدْنِي عِلْمًا  yang tepat adalah ?",
            "Sambungan doa ...بِسْمِ اللهِ تَوَكَّلْتُ عَلَى اللهِ، لَا حَوْلَ yang tepat adalah ?",
            "Sambungan doa ...اَلْحَمْدُ للهِ الَّذِىْ اَطْعَمَنَا yang tepat adalah ?",
            "Sambungan doa ...اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا yang tepat adalah ?",
    };


    //membuat array untuk pilihan jawaban
    private String pilihanJawaban[][] = {
            {"Sebelum makan","Sesudah makan","Sebelum masuk kamar mandi"},
            {"Sebelum tidur","Sesudah makan","Sebelum Belajar"},
            {"Ketika bangun tidur","Sebelum tidur","Ketika bercermin"},
            {"Sebelum masuk kamar mandi","Ketika bangun tidur","Ketika keluar rumah"},
            {"خَلْقِيْ فَحَسِّنْ خُلُقِيْ","وَإِلَيْهِ النُّشُورُ","وَقِنَا عَذَابَ النَّارِ "},
            {"وَقِنَا عَذَابَ النَّارِ"," وَارْزُقْنِيْ فَهْمًا","وَإِلَيْهِ النُّشُورُ"},
            {"وَلَا قُوَّةَ إِلَّا بِاللهِ","خَلْقِيْ فَحَسِّنْ خُلُقِيْ","وَاجْعَلْنِيْ مِنَ الصَّالِحِيْنَ"},
            {"خَلْقِيْ فَحَسِّنْ خُلُقِيْ","وَلَا قُوَّةَ إِلَّا بِاللهِ"," وَسَقَانَا وَجَعَلَنَا مُسْلِمِيْنَ"},
            {"خَلْقِيْ فَحَسِّنْ خُلُقِيْ","وَقِنَا عَذَابَ النَّارِ","وَسَقَانَا وَجَعَلَنَا مُسْلِمِيْنَ"},
    };

    //membuat array untuk jawaban benar
    private String jawabanBenar[] = {
            "Sebelum makan",
            "Sebelum tidur",
            "Ketika bangun tidur",
            "Sebelum masuk kamar mandi",
            "خَلْقِيْ فَحَسِّنْ خُلُقِيْ",
            " وَارْزُقْنِيْ فَهْمًا",
            "وَلَا قُوَّةَ إِلَّا بِاللهِ",
            " وَسَقَانَا وَجَعَلَنَا مُسْلِمِيْنَ",
            "وَقِنَا عَذَابَ النَّارِ",
    };

    //membuat getter untuk mengambil pertanyaan
    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    //membuat getter untuk mengambil pilihan jawaban 1
    public String getPilihanJawaban1(int x){
        String jawaban1 = pilihanJawaban[x][0];
        return jawaban1;
    }

    //membuat getter untuk mengambil pilihan jawaban 2
    public String getPilihanJawaban2(int x){
        String jawaban2 = pilihanJawaban[x][1];
        return jawaban2;
    }

    //membuat getter untuk mengambil pilihan jawaban 3
    public String getPilihanJawaban3(int x){
        String jawaban3 = pilihanJawaban[x][2];
        return jawaban3;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}
