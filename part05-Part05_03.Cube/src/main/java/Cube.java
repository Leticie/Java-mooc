/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leticie
 */
public class Cube {
    
    private int edgeLenght;
    
    public Cube (int edgeLength) {
        this.edgeLenght = edgeLength;
    }
    
    public int volume() {
        return this.edgeLenght * this.edgeLenght * this.edgeLenght;
    }
    
    public String toString() {
        return "The length of the edge is " + this.edgeLenght + " and the volume " + volume();
    }
}
