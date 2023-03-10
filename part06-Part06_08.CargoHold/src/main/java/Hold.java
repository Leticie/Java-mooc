
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
public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> list;
    
    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.list = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= this.maximumWeight) {
            this.list.add(suitcase);
        }    
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Suitcase suitcaseInList : list) {
            totalWeight += suitcaseInList.totalWeight();
        }
        return totalWeight;
    }
    
    public void printItems() {
        for (Suitcase suitcaseInList : list) {
            suitcaseInList.printItems();
        }
    }
    
    public String toString() {
        return this.list.size() + " suitcases (" + totalWeight() + " kg)";
    }
    
}
