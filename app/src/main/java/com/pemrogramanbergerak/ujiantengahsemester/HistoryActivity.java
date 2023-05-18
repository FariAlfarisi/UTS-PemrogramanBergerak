package com.pemrogramanbergerak.ujiantengahsemester;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HistoryActivity extends AppCompatActivity {
    RecyclerView recyclerViewItemList;
    List<Item> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        initHistoryItemList();

        recyclerViewItemList = findViewById(R.id.historyitemlist);
        HistoryItemAdapter itemAdapter = new HistoryItemAdapter(this, itemList);

        recyclerViewItemList.setAdapter(itemAdapter);
        recyclerViewItemList.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initHistoryItemList() {
        itemList = new ArrayList<>();
        itemList.add(new Item("Blue T-Shirt", "Rp250.000", R.drawable.tshirt));
        itemList.add(new Item("Blue Jeans", "Rp450.000", R.drawable.jeans));
        itemList.add(new Item("Red Sneakers", "Rp1.250.000", R.drawable.sneakers));
    }
}