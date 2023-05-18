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

public class SearchItemAdapter extends RecyclerView.Adapter<SearchItemAdapter.ItemViewHolder> {
    Context context;
    List<Item> itemList;

    public SearchItemAdapter(Context context, List<Item> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    public void setFilteredList(List<Item> filteredList){
        this.itemList = filteredList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_list, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        String name = itemList.get(position).getName();
        int image = itemList.get(position).getImage();
        String price = itemList.get(position).getPrice();

        holder.ItemName.setText(name);
        holder.ItemImage.setImageResource(image);
        holder.ItemPrice.setText(price);
    }

    @Override
    public int getItemCount() {

        return itemList.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder{
        TextView ItemName, ItemPrice;
        ImageView ItemImage;
        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            ItemName = itemView.findViewById(R.id.item_name);
            ItemImage = itemView.findViewById(R.id.item_image);
            ItemPrice = itemView.findViewById(R.id.item_price);
        }
    }
}
