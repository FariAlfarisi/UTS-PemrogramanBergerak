package com.pemrogramanbergerak.ujiantengahsemester;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class NotificationsActivity extends AppCompatActivity {
    RecyclerView recyclerViewChatList;
    List<Seller> sellerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);

        initNotificationsChatList();

        recyclerViewChatList = findViewById(R.id.chatnotificationslist);
        NotificationsAdapter itemAdapter = new NotificationsAdapter(this, sellerList);

        recyclerViewChatList.setAdapter(itemAdapter);
        recyclerViewChatList.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initNotificationsChatList() {
        sellerList = new ArrayList<>();
        sellerList.add(new Seller("UNIQLO", "Halo kak! Terima kasih sudah berbelanja di toko kami, semoga puas ya!! :)", R.drawable.uniqlo_logo));
        sellerList.add(new Seller("LEVI'S Store", "Thank you for having us! Have a good day...", R.drawable.levis_logo));
        sellerList.add(new Seller("Converse Official", "Terima kasih sudah berbelanja di toko kami! Kamu mendapat potongan...", R.drawable.converse_logo));
    }
}