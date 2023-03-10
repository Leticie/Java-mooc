
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
public class Points {
    private ArrayList<Integer> pointsList;
    private String[] stars;
    
    public Points() {
        this.pointsList = new ArrayList<Integer>();
        this.stars = new String[6];
        // array cannot be empty, otherwise null error
        for (int i = 0; i <= 5; i++) {
            this.stars[i] = "";
        }
    }
    
    public void add(int points) {
        if (points <= 100 && points >= 0) {
            this.pointsList.add(points);
        }    
    }
    
    public double averageAll() {
        int sum = 0;
        int itemsInList = 0;
        
        for (Integer point: this.pointsList) {
            sum += point;
            itemsInList += 1;
        }
        double average = (double) sum / itemsInList;
        return average;
    }
    
    public double averagePassing() {
        int sumPassing = 0;
        int itemsPassing = 0;
        
        for (Integer point: this.pointsList) {
            if (point >= 50) {
                sumPassing += point;
                itemsPassing += 1;
            }    
        }
        double average = (double) sumPassing / itemsPassing;
        return average;
    }
    
    public double passPercentage() {
        int itemsNotPassing = 0;
        int itemsPassing = 0;
        
        for (Integer point: this.pointsList) {
            if (point >= 50) {
                itemsPassing += 1;   
            } else {
                itemsNotPassing += 1;
            }
        }
        double percentagePassing = 100 * (double)itemsPassing / ((double)itemsNotPassing + itemsPassing);
        return percentagePassing;
    }
    
    public void pointsIntoStars() {
        for (Integer point: this.pointsList) {
            if (point < 50) {
                this.stars[0] += "*";
            } else if (point < 60) {
                this.stars[1] += "*";
            } else if (point < 70) {
                this.stars[2] += "*";
            } else if (point < 80) {
                this.stars[3] += "*";
            } else if (point < 90) {
                this.stars[4] += "*";
            } else {
                this.stars[5] += "*";
            }
        }    
    }
    
    public String[] getStars(){
        return this.stars;
    }
    
}