/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leticie
 */
public class Recipe {
    private String name;
    private int cookingTime;
    private String ingredients;
    
    public Recipe(String name, int cookingTime, String ingredients){
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }
    
    public String toString() {
        return this.name + ", cooking time: " + this.cookingTime;
    }
}
