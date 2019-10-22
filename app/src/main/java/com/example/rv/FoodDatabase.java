package com.example.rv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FoodDatabase {
    public static FoodItems getFoodItemsByID(int foodItemID) {
        return foodItems.get(foodItemID);
    }
    public static ArrayList<FoodItems> getAllFoodItems(); {
        return new ArrayList<FoodItems> ((List) Arrays.asList(foodItems.values().toArray()));
    }
    private static final HashMap<Integer, FoodItems> foodItems = new HashMap<>();
    static {
        foodItems.put(1, new FoodItems(
                1,
                "Burger",
                "$7.50",
                "A burger that has many things",
                 R.drawable.ic_launcher_background
        ));
        foodItems.put(2, new FoodItems(
                2,
                "Onion Rings",
                "$1.50",
                "A bunch of onion rings",
                R.drawable.ic_launcher_background
        ));
    }}
