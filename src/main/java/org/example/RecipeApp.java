package org.example;

import java.util.Arrays;
import java.util.List;

//Main class to run the App
public class RecipeApp {
    public static void main(String[] args) {
        RecipeCollections collections = new RecipeCollections();


        //Creating a new recipe
        List<String> ingredients = Arrays.asList("flour","sugar","milk","eggs","butter","yeast");
        List<String> Directions = Arrays.asList("Mixed Ingredients", "Bake for 20mins");
        Recipe cakeRecipe = new Recipe("cake",ingredients,Directions,20);

        //Add recipe to collections
        collections.addRecipes(cakeRecipe);

        //print out a recipe
        collections.printRecipe(cakeRecipe);
    }
}