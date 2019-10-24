package com.example.rv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FoodDatabase {

    public static FoodItems getFoodItemsByID(int foodItemID) {
        return foodItems.get(foodItemID);
    }


    public static ArrayList<FoodItems> getAllFoodItems() {
        return new ArrayList<FoodItems> ((List) Arrays.asList(foodItems.values().toArray()));
    }

    private static final HashMap<Integer, FoodItems> foodItems = new HashMap<>();
    static {
        foodItems.put(1, new FoodItems(
                1,
                "Burger",
                "$7.50",
                "A burger that has many things",
                 R.drawable.burger_rv
        ));
        foodItems.put(2, new FoodItems(
                2,
                "Bacon King",
                "$1.50",
                "A bunch of onion rings",
                R.drawable.ic_launcher_background
        ));
        foodItems.put(3, new FoodItems(
                3,
                "Impossible Burger",
                "$1.50",
                "A bunch of onion rings",
                R.drawable.ic_launcher_background
        ));
        foodItems.put(4, new FoodItems(
                4,
                "Quarter Pound",
                "$1.50",
                "A bunch of onion rings",
                R.drawable.ic_launcher_background
        ));
        foodItems.put(5, new FoodItems(
                5,
                "BBQ Bacon",
                "$1.50",
                "A bunch of onion rings",
                R.drawable.ic_launcher_background
        ));
        foodItems.put(6, new FoodItems(
                6,
                "Bacon&Cheese",
                "$1.50",
                "A bunch of onion rings",
                R.drawable.ic_launcher_background
        ));foodItems.put(6, new FoodItems(
                6,
                "Pretzel Bacon King",
                "$1.50",
                "A bunch of onion rings",
                R.drawable.ic_launcher_background
        ));foodItems.put(7, new FoodItems(
                7,
                "Double Pretzel Bacon King",
                "$1.50",
                "A bunch of onion rings",
                R.drawable.ic_launcher_background
        ));foodItems.put(8, new FoodItems(
                8,
                "Cheeseburger",
                "$1.50",
                "A bunch of onion rings",
                R.drawable.ic_launcher_background
        ));foodItems.put(9, new FoodItems(
                9,
                "Double Cheeseburger",
                "$1.50",
                "A bunch of onion rings",
                R.drawable.ic_launcher_background
        ));foodItems.put(10, new FoodItems(
                10,
                "Bacon Cheeseburger",
                "$1.50",
                "A bunch of onion rings",
                R.drawable.ic_launcher_background
        ));foodItems.put(11, new FoodItems(
                11,
                "Bacon Double Cheeseburger",
                "$1.50",
                "A bunch of onion rings",
                R.drawable.ic_launcher_background
        ));foodItems.put(12, new FoodItems(
                12,
                "Onion Rings",
                "$1.50",
                "A bunch of onion rings",
                R.drawable.ic_launcher_background
        ));foodItems.put(13, new FoodItems(
                13,
                "French fries",
                "$1.50",
                "A bunch of onion rings",
                R.drawable.ic_launcher_background
        ));foodItems.put(14, new FoodItems(
                14,
                "Hash Browns",
                "$1.50",
                "A bunch of onion rings",
                R.drawable.ic_launcher_background
        ));foodItems.put(15, new FoodItems(
                15,
                "Mozarella Sticks",
                "$1.50",
                "A bunch of onion rings",
                R.drawable.ic_launcher_background
        ));
    }}
