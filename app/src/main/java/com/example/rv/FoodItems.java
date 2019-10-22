package com.example.rv;

public class FoodItems {
    private int foodID;
    private String foodName;
    private String foodCost;
    private String context;
    private int imageDrawable;

    public FoodItems(int foodID, String foodName, String foodCost, String context, int imageDrawable) {
        this.foodID = foodID;
        this.foodName = foodName;
        this.foodCost = foodCost;
        this.context = context;
        this.imageDrawable = imageDrawable;
    }

    public int getFoodID() {
        return foodID;
    }

    public void setFoodID(int foodID) {
        this.foodID = foodID;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodCost() {
        return foodCost;
    }

    public void setFoodCost(String foodCost) {
        this.foodCost = foodCost;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public int getImageDrawable() {
        return imageDrawable;
    }

    public void setImageDrawable(int imageDrawable) {
        this.imageDrawable = imageDrawable;
    }
}
