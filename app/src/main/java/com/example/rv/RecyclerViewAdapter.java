package com.example.rv;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
        private static final String TAG = "RecycleViewAdapter";
private ArrayList<String> mImageNames = new ArrayList<>();
private ArrayList<String> mImages = new ArrayList<>();
private Context mContext;

    public RecyclerViewAdapter(ArrayList<String> mImageNames, ArrayList<String> mImages, Context mContext) {
        this.mImageNames = mImageNames;
        this.mImages = mImages;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called");
        holder.imageName.setText(mImageNames.get(position));
        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();


            }
            //final Article articleAtPosition = articlesToAdapt.get(position);
            //
            //        holder.headlineTextView.setText(articleAtPosition.getHeadline());
            //        holder.summaryTextView.setText(articleAtPosition.getSummary());
            //
            //
            //        holder.view.setOnClickListener(new View.OnClickListener() {
            //            @Override
            //            public void onClick(View view) {
            //                Context context = view.getContext();
            //
            //                Intent intent = new Intent(context, ArticleDetailActivity.class);
            //                intent.putExtra("ArticleID", articleAtPosition.getArticleID());
            //                context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return mImageNames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
            ImageView image;
            TextView imageName;
            RelativeLayout parentLayout;
            public ViewHolder (View itemView) {
                super(itemView);
                image = itemView.findViewById(R.id.image);
                imageName = itemView.findViewById(R.id.image_name);
                parentLayout = itemView.findViewById(R.id.parent_layout);

            }
        }
    }

