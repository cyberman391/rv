package com.example.rv;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    private TextView headlineTextView;
    private TextView authorTextView;
    private TextView contentTextView;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        int foodID = intent.getIntExtra("FoodID", 0);
        FoodItems foodItems = FoodDatabase.getFoodItemsByID(foodID);

        headlineTextView = findViewById(R.id.foodName);
        authorTextView = findViewById(R.id.foodCost);
        contentTextView = findViewById(R.id.foodContext);
        //imageView = findViewById(R.id.detailImage);

        // Set the views to show the data of our object
        headlineTextView.setText(foodItems.getFoodName());
        authorTextView.setText(foodItems.getFoodCost());
        contentTextView.setText(foodItems.getContext());
    }
}
