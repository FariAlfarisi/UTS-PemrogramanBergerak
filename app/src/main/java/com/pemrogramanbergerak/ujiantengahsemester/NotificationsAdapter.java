package com.pemrogramanbergerak.ujiantengahsemester;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NotificationsAdapter extends RecyclerView.Adapter<NotificationsAdapter.NotificationsViewHolder> {
    Context context;
    List<Seller> sellerList;

    public NotificationsAdapter(Context context, List<Seller> sellerList) {
        this.context = context;
        this.sellerList = sellerList;
    }

    @NonNull
    @Override
    public NotificationsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.chat_list, parent, false);
        return new NotificationsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotificationsViewHolder holder, int position) {
        String name = sellerList.get(position).getSellername();
        int image = sellerList.get(position).getSellerlogo();
        String text = sellerList.get(position).getSellerchat();

        holder.SellerName.setText(name);
        holder.SellerLogo.setImageResource(image);
        holder.SellerChat.setText(text);
    }

    @Override
    public int getItemCount() {
        return sellerList.size();
    }

    public class NotificationsViewHolder extends RecyclerView.ViewHolder{
        TextView SellerName, SellerChat;
        ImageView SellerLogo;
        public NotificationsViewHolder(@NonNull View itemView) {
            super(itemView);
                SellerName = itemView.findViewById(R.id.seller_name);
                SellerLogo = itemView.findViewById(R.id.seller_logo);
                SellerChat = itemView.findViewById(R.id.seller_chat);
            }
        }
}
