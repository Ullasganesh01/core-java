package com.xworkz.food_ingredients;

import com.xworkz.food_ingredients.food.Food;
import com.xworkz.food_ingredients.ingredients.Ingredient;

public class FoodIngredientsTester {
    public static void main(String[] args) {
        Ingredient ingredient = new Ingredient();
        Food food = new Food();
        food.ingredient = ingredient;
    }
}
