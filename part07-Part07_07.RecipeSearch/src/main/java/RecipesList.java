import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leticie
 */
public class RecipesList {
    private ArrayList<Recipe> recipes;
    
    public RecipesList(){
        this.recipes = new ArrayList<Recipe>();
    }
    
    public void addRecipe(Recipe newRecipe) {
        this.recipes.add(newRecipe);
    }
    
    public void printList() {
        for (Recipe recipe : this.recipes) {
            System.out.println(recipe);
        }    
    }
}
