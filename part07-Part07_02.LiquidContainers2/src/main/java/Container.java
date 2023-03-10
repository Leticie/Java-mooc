
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
public class Container {
    private int limit;
    private int liquid;
    
    public Container(){
        this.limit = 100;
        this.liquid = 0;
    }    

    public int contains() {
        return this.liquid;
    }
    
    public void add(int amount) {
        if (amount >=0) {
            this.liquid += amount;
            if (this.liquid > limit) {
                this.liquid = 100;
            }
        }    
    }
    
    public void remove(int amount) {
        if (amount >=0) {
            this.liquid -= amount;
            if (this.liquid < 0) {
                this.liquid = 0;
            }
        }    
    }
    
    public String toString() {
        return this.liquid + "/100";
    }
}

