package com.example.dovi.sejarahdunia;

import java.util.Random;

public class KumpulanSejarah {
    // Fields (Variabel dari member) - Propertis tentang object
    private String[] mCerita = {
            "Indonesia mederka pada tahun 1945",
            "Jepang menyerah kepada sekutu Amerika",
            "Jerman perang ke Polondia",
            "Uni Soviet di wilayah Rusia",
            "Pada tahun 1945 sudah selesai perang dunia 2"
    };

    // Method - Aksi dimana object tersebut bisa mengambilnya
    public String getCerita() {

        String cerita = "";

        // Memilih sejarah secara acar
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mCerita.length);
        cerita = mCerita[randomNumber];

        return cerita;

    }

}
