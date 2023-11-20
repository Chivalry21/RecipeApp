package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


//RecipeCollections stores all recipe
public class RecipeCollections {
    public List<Recipe> recipes;

        public RecipeCollections() {

        }
        //Method to search recipe by name
        public List<Recipe> searchByName (String name) {
            List<Recipe> results = recipes.stream()
                    .filter(recipe -> recipe.getName().equalsIgnoreCase(name))
                    .collect(Collectors.toList());
            return results;
        }

        //Method to search for recipe by Ingredient
        public List<Recipe> searchByIngredients (String Ingredients) {
            List<Recipe> results = recipes.stream()
                    .filter(recipe -> recipe.getIngredients().contains(Ingredients))
                    .collect(Collectors.toList());
            return results;
        }

        //Method to add recipe
        public void addRecipes(Recipe recipe) {
            if(recipes == null)
                recipes = new ArrayList<>();
            recipes.add(recipe);
        }

        //Method to delete recipe
        public void deleteRecipes(Recipe recipe) {
            recipes.remove(recipe);
        }

        //Method to edit recipe
        public void editRecipes(Recipe recipe, Recipe newRecipe) {
            int index = recipes.indexOf(recipe);
            recipes.set(index,newRecipe);
        }

        //Method to print out a recipe
        public void printRecipe(Recipe recipe) {
            System.out.println("name:" + recipe.getName());
            System.out.println("Ingredients:" + recipe.getIngredients());
            System.out.println("Directions:" + recipe.getDirection());
            System.out.println("Time:" + recipe.getTime() + "minutes");
        }
    }


