
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
public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;
    
    public Suitcase (int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        if (item.getWeight() + totalWeight() <= this.maxWeight) {
            this.items.add(item);
        }    
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Item itemInList : this.items) {
            totalWeight += itemInList.getWeight();
        }
        return totalWeight;
    }
    
    public void printItems() {
        for (Item itemInList : this.items) {
            System.out.println(itemInList);
        }
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        int heaviest = 0;
        Item heaviestItem = this.items.get(0);
        for (Item itemInList : this.items) {
            if (itemInList.getWeight() > heaviest) {
                heaviest = itemInList.getWeight();
                heaviestItem = itemInList;
            }
        }
        return heaviestItem;
    }
    
    public String toString() {
        if (this.items.size() == 1) {
            return "1 item (" + totalWeight() + " kg)";
        } if (this.items.size() > 1) {
            return this.items.size() + " items (" + totalWeight() + " kg)";
        }
        return "no items (0 kg)";
    }
    
}
