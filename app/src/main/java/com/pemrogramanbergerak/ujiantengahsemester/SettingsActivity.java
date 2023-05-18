package com.pemrogramanbergerak.ujiantengahsemester;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SettingsActivity extends AppCompatActivity {
    RecyclerView recyclerViewSettingsList;
    List<SettingsList> settingsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        initsettingsList();

        recyclerViewSettingsList = findViewById(R.id.settingslist);
        SettingsListAdapter settingsListAdapter = new SettingsListAdapter(this, settingsList);

        recyclerViewSettingsList.setAdapter(settingsListAdapter);
        recyclerViewSettingsList.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initsettingsList() {
        settingsList = new ArrayList<>();
        settingsList.add(new SettingsList("Account Settings"));
        settingsList.add(new SettingsList("My Favorites"));
        settingsList.add(new SettingsList("FAQ"));
    }
}