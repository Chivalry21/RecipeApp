package org.example;

import java.util.List;

public class Recipe {

    //Recipe class to store recipe information
        private String name;
        private List<String> ingredients;
        private  List<String> direction;
        private int time;

        public Recipe(String name, List<String> ingredients, List<String> direction, int time) {
            this.name = name;
            this.ingredients = ingredients;
            this.direction = direction;
            this.time = time;
        }

        public String getName() {
            return name; }

        public List<String> getIngredients() {
            return ingredients; }

        public List<String> getDirection() {
            return direction; }

        public int getTime() {
            return time; }


}
