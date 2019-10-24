package com.example.rv;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rv.DetailActivity;
import com.example.rv.FoodItems;
import com.example.rv.R;

import java.util.ArrayList;


public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ArticleViewHolder> {

    private ArrayList<FoodItems> foodItemstoAdapt;

    public void setData(ArrayList<FoodItems> foodItemstoAdapt) {
        // This is basically a Setter that we use to give data to the adapter
        this.foodItemstoAdapt = foodItemstoAdapt;
    }

    @NonNull
    @Override
    public ArticleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view =
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.fooditem, parent, false);


        ArticleViewHolder articleViewHolder = new ArticleViewHolder(view);
        return articleViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ArticleViewHolder holder, int position) {

        final FoodItems foodItemAtPosition = foodItemstoAdapt.get(position);

        holder.headlineTextView.setText(foodItemAtPosition.getFoodName());
        holder.summaryTextView.setText(foodItemAtPosition.getContext());


        holder.itemImageView.setImageResource(foodItemAtPosition.getImageDrawable());
    }

    @Override
    public int getItemCount() {
        return foodItemstoAdapt.size();
    }


    public static class ArticleViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView headlineTextView;
        public TextView summaryTextView;
        public ImageView shareImageView;
        public ImageView itemImageView;

        public ArticleViewHolder(View v) {
            super(v);
            view = v;
            headlineTextView = v.findViewById(R.id.foodName);
            summaryTextView = v.findViewById(R.id.foodCost);
            itemImageView = v.findViewById(R.id.newsPhoto);
        }
    }
}
