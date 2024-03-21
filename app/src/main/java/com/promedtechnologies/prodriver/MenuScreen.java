package com.promedtechnologies.prodriver;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuScreen extends AppCompatActivity {
    CardView profile, scan, checklist, tripsheet, upload, report, navigate, technical;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen);
        profile = findViewById(R.id.profile);
        scan = findViewById(R.id.scan);
        checklist = findViewById(R.id.checklist);
        tripsheet = findViewById(R.id.tripsheet);
        upload  = findViewById(R.id.upload);
        report = findViewById(R.id.report);
        navigate = findViewById(R.id.navigate);
        technical = findViewById(R.id.technical);

        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuScreen.this, BarcodeScreen.class);
                startActivity(intent);

            }
        });

        checklist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuScreen.this, ChecklistScreen.class);
                startActivity(intent);
            }
        });

        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuScreen.this, PodScreen.class);
                startActivity(intent);
            }
        });




    }
}