package com.example.dovi.sejarahdunia;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class SejarahDuniaActivity extends AppCompatActivity {
    private KumpulanSejarah mKumpulanSejarah = new KumpulanSejarah();
    private Warna mWarna = new Warna();
    // Mendeklarasikan variabel View
    private TextView mCeritaView;
    private Button mLihatMacamSejarahButton;
    private RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sejarah_dunia);

        // Mengassign View dari file layout ke variabel
        mCeritaView = (TextView) findViewById(R.id.CeritaTextView);
        mLihatMacamSejarahButton = (Button) findViewById(R.id.LihatMacamSejarahButton);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cerita = mKumpulanSejarah.getCerita();
                int warna = mWarna.getWarna();

                // Update text sejarah dengan cerita yang sudah kita tentukan secara dinamis
                mCeritaView.setText(cerita);
                mRelativeLayout.setBackgroundColor(warna);
                mLihatMacamSejarahButton.setTextColor(warna);

                // Menculkan toast berhasil
                Log.d("SejarahDuniaActivity", "Log dari method onClick.");
                // Toast.makeText(SejarahDuniaActivity.this, "Selamat Membaca Sejarah!", Toast.LENGTH_LONG).show();

            }
        };
        mLihatMacamSejarahButton.setOnClickListener(listener);

        Log.d("SejarahDuniaActivity", "Log dari method onCreate.");
        // Toast.makeText(SejarahDuniaActivity.this, "Selamat Datang", Toast.LENGTH_LONG).show();
    }
}
