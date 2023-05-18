package com.pemrogramanbergerak.ujiantengahsemester;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageButton useractivity;
    ImageButton historyactivity;
    ImageButton notificationsactivity;
    ImageButton settingsactivity;
    ImageButton searchactivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        useractivity = findViewById(R.id.UserImageButton);

        useractivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UserActivity.class);
                startActivity(intent);
            }
        }
        );

        historyactivity = findViewById(R.id.HistoryImageButton);

        historyactivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HistoryActivity.class);
                startActivity(intent);
            }
        }
        );


        searchactivity = findViewById(R.id.SearchImageButton);

        searchactivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        }
        );


        notificationsactivity = findViewById(R.id.NotificationsImageButton);

        notificationsactivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NotificationsActivity.class);
                startActivity(intent);
            }
        }
        );

        settingsactivity = findViewById(R.id.SettingsImageButton);

        settingsactivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        }
        );

        }
}