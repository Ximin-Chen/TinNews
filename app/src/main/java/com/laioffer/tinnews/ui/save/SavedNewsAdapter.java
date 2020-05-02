package com.laioffer.tinnews.ui.save;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.laioffer.tinnews.R;

public class SavedNewsAdapter {

    public static class SavedNewsViewHolder extends RecyclerView.ViewHolder {
        TextView author;
        TextView description;
        ImageView icon;

        public SavedNewsViewHolder(View itemView) {
            super(itemView);
            author = itemView.findViewById(R.id.author);
            description = itemView.findViewById(R.id.description);
            icon = itemView.findViewById(R.id.image);
        }
    }
}