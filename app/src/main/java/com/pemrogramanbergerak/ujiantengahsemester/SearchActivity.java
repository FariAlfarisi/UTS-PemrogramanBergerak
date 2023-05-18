package com.pemrogramanbergerak.ujiantengahsemester;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity {
    RecyclerView recyclerViewItemList;
    List<Item> itemList;
    SearchView searchView;
    SearchItemAdapter searchItemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        searchView = findViewById(R.id.searchView);
        searchView.clearFocus();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filterList(newText);
                return true;
            }
        });

        initSearchHItemList();

        recyclerViewItemList = findViewById(R.id.searchlist);
        SearchItemAdapter searchItemAdapter = new SearchItemAdapter(this, itemList);
        recyclerViewItemList.setAdapter(searchItemAdapter);
        recyclerViewItemList.setLayoutManager(new LinearLayoutManager(this));
    }

    private void filterList(String text) {
        List<Item> filteredList = new ArrayList<>();
        for (Item item : itemList){
            if (item.getName().toLowerCase().contains(text.toLowerCase())){
                filteredList.add(item);
            }
        }
        if (filteredList.isEmpty()) {
            Toast.makeText(this, "No Data", Toast.LENGTH_SHORT).show();
        }else{
            searchItemAdapter.setFilteredList(filteredList);
        }
    }

    private void initSearchHItemList() {
        itemList = new ArrayList<>();
        itemList.add(new Item("Red Sneakers", "Rp1.250.000", R.drawable.sneakers));
        itemList.add(new Item("Blue Jeans", "Rp450.000", R.drawable.jeans));
        itemList.add(new Item("Blue T-Shirt", "Rp250.000", R.drawable.tshirt));
    }

}