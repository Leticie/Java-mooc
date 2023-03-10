/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leticie
 */
public class Data {
    
    private String identifier;
    private String name;
    
    public Data(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
    
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        
        if (!(compared instanceof Data)) {
            return false;
        }
        
        Data comparedData = (Data) compared;
        
        if (this.identifier.equals(comparedData.identifier)) {
            return true;
        } 
        return false;
    }
    
    public String toString(){
        return this.identifier + ": " + this.name;
    }
    
}
