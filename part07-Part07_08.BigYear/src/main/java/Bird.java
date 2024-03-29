/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leticie
 */
public class Bird {
    private String name;
    private String nameInLatin;
    private int observationCount;
    
    public Bird(String name, String nameInLatin) {
        this.name = name;
        this.nameInLatin = nameInLatin;
        this.observationCount = 0;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void addObservation() {
        this.observationCount += 1;
    }

    public String toString() {
        return name + " (" + this.nameInLatin + ") : " + this.observationCount + " observations"; 
    } 
}
