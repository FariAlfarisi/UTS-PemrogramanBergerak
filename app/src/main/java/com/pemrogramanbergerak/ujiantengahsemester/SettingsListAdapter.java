package com.pemrogramanbergerak.ujiantengahsemester;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SettingsListAdapter extends RecyclerView.Adapter<SettingsListAdapter.SettingsViewHolder> {
    Context context;
    List<SettingsList> settingsList;

    public SettingsListAdapter(Context context, List<SettingsList> settingsList) {
        this.context = context;
        this.settingsList = settingsList;
    }

    @NonNull
    @Override
    public SettingsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.settings_list, parent, false);
        return new SettingsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SettingsViewHolder holder, int position) {
        String name = settingsList.get(position).getName();

        holder.Settingname.setText(name);
    }

    @Override
    public int getItemCount() {
        return settingsList.size();
    }

    public class SettingsViewHolder extends RecyclerView.ViewHolder {
        TextView Settingname;

        public SettingsViewHolder(@NonNull View itemView) {
            super(itemView);
            Settingname = itemView.findViewById(R.id.setting_name);
        }
    }
}
