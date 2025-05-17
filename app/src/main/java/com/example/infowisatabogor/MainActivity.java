package com.example.infowisatabogor;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnMaps, btnDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMaps = findViewById(R.id.btnMaps);
        btnDetail = findViewById(R.id.btnDetail);

        btnMaps.setOnClickListener(v -> {
            Uri location = Uri.parse("geo:-6.6569,106.9336?q=Puncak+Bogor");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        });

        btnDetail.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            startActivity(intent);
        });
    }
}