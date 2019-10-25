package com.example.rv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FoodDatabase {

    public static FoodItems getFoodItemsByID(int foodID) {
        return foodItems.get(foodID);
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
                 7.5,
                 R.drawable.burger_rv
        ));
        foodItems.put(2, new FoodItems(
                2,
                "Bacon King",
                "$1.50",
                "Bacon filled delight",
                1.5,
                R.drawable.ic_launcher_background
        ));
        foodItems.put(3, new FoodItems(
                3,
                "Impossible Burger",
                "$8.50",
                "The new impossible burger!!!",
                8.5,
                R.drawable.ic_launcher_background
        ));
        foodItems.put(4, new FoodItems(
                4,
                "Quarter Pound",
                "$8.50",
                "A classic quarter pounder",
                8.5,
                R.drawable.ic_launcher_background
        ));
        foodItems.put(5, new FoodItems(
                5,
                "BBQ Bacon",
                "$7.50",
                "Barbeque with bacon",
                7.5,
                R.drawable.ic_launcher_background
        ));
        foodItems.put(6, new FoodItems(
                6,
                "Bacon&Cheese",
                "$7.0",
                "Bacon with cheese",
                7.0,
                R.drawable.ic_launcher_background
        ));foodItems.put(7, new FoodItems(
                6,
                "Pretzel Bacon King",
                "$9.0",
                "A pretzel filled burger with bacon",
                9,
                R.drawable.ic_launcher_background
        ));foodItems.put(8, new FoodItems(
                7,
                "Double Pretzel Bacon King",
                "$10.0",
                "More pretzel included",
                10.0,
                R.drawable.ic_launcher_background
        ));foodItems.put(9, new FoodItems(
                8,
                "Cheeseburger",
                "$6.50",
                "A cheese fun filled meal",
                6.5,
                R.drawable.ic_launcher_background
        ));foodItems.put(10, new FoodItems(
                9,
                "Double Cheeseburger",
                "$7.5",
                "More cheese included!",
                7.0,
                R.drawable.ic_launcher_background
        ));foodItems.put(11, new FoodItems(
                11,
                "Bacon Cheeseburger",
                "$7.0",
                "A cheeseburger with bacon",
                7.0,
                R.drawable.ic_launcher_background
                ));
        foodItems.put(12, new FoodItems(
                12,
                "Onion Rings",
                "$1.50",
                "A bunch of onion rings",
                1.5,
                R.drawable.ic_launcher_background
        ));foodItems.put(13, new FoodItems(
                13,
                "French fries",
                "$1.50",
                "A bunch of fries",
                1.5,
                R.drawable.ic_launcher_background
        ));foodItems.put(14, new FoodItems(
                14,
                "Hash Browns",
                "$1.50",
                "Some hash browns",
                1.5,
                R.drawable.ic_launcher_background
        ));foodItems.put(15, new FoodItems(
                15,
                "Mozarella Sticks",
                "$1.50",
                "A bunch of sticks coated in mozarella",
                1.5,
                R.drawable.ic_launcher_background
        ));
    }}
