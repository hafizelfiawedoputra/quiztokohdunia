package com.example.dovi.sejarahdunia;

import android.graphics.Color;

import java.util.Random;

public class Warna {
        // Fields (Variabel dari member) - Propertis tentang object
        private String[] mWarna = {
                "#39add1", // light blue
                "#3079ab", // dark blue
                "#c25975", // mauve
                "#e15258", // red
                "#f9845b", // orange
                "#838cc7", // lavender
                "#7b669e", // aqua
                "#51b46d", // green
                "#e0ab18", // mustard
                "#f092b0", // pink
                "#b7c0c7", // light gray
                "#ffffff", // white
        };

        // Method - Aksi dimana object tersebut bisa mengambilnya
        public int getWarna() {

            String warna;

            // Memilih sejarah secara acar
            Random randomGenerator = new Random();
            int randomNumber = randomGenerator.nextInt(mWarna.length);
            warna = mWarna[randomNumber];
            int colorSebagaiInt = Color.parseColor(warna);

            return colorSebagaiInt;

        }
    }
