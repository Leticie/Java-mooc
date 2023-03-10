import java.nio.file.Paths;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leticie
 */
public class UserInterface {
    
    public UserInterface() {
    }
    
    public String readFile(String inputFile) {
        String text = "";
        try (Scanner scanFile = new Scanner(Paths.get(inputFile))){
            while (scanFile.hasNextLine()) {
                String row = scanFile.nextLine();
                // separating recipes from each other
                if (row.isEmpty()) {
                    text += "nextRecipe";
                } else {
                    text += row + "\n";
                }    
  
            }
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return text;
    }
    
    public String[] dividingByRecipes(String inputFile) {
        String text = readFile(inputFile);
        String[] recipes = text.split("nextRecipe");
        return recipes;
    }


    public void list(String inputFile) {
        String[] recipes = dividingByRecipes(inputFile);

        for (int i = 0; i < recipes.length; i++) {
            String[] recipesParts = recipes[i].split("\n");
            System.out.println(recipesParts[0] + ", cooking time: " + recipesParts[1]);  
        }
    }
    
    public void findName(String inputFile, String searchedName) {
        String[] recipes = dividingByRecipes(inputFile);
        
        System.out.println("Recipes: ");
        
        for (int i = 0; i < recipes.length; i++) {
            String[] recipesParts = recipes[i].split("\n");
            if (recipesParts[0].contains(searchedName)) {
                System.out.println(recipesParts[0] + ", cooking time: " + recipesParts[1]);
            }
        }    
    }
    
    public void findCookingTime(String inputFile, int maxCookingTime) {
        String[] recipes = dividingByRecipes(inputFile);
        
        System.out.println("Recipes: ");
        
        for (int i = 0; i < recipes.length; i++) {
            String[] recipesParts = recipes[i].split("\n");
            if (Integer.valueOf(recipesParts[1]) <= (maxCookingTime)) {
                System.out.println(recipesParts[0] + ", cooking time: " + recipesParts[1]);
            }
        }   
    }
    
    public void findIngredient(String inputFile, String searchedIngredient) {
        String[] recipes = dividingByRecipes(inputFile);
        
        System.out.println("Recipes: ");
        
        for (int i = 0; i < recipes.length; i++) {
            String[] recipesParts = recipes[i].split("\n");
            for (int j = 2; j < recipesParts.length; j++) {
                if (recipesParts[j].equals(searchedIngredient)) {
                    System.out.println(recipesParts[0] + ", cooking time: " + recipesParts[1]);
                }
            }    
        }    
    }          
}
