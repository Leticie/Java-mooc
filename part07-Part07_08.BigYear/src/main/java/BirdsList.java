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
public class BirdsList {
    private ArrayList<Bird> listOfBirds;
    
    public BirdsList() {
        this.listOfBirds = new ArrayList<Bird>();
    }
    
    public void addBird(Bird bird) {
        this.listOfBirds.add(bird);    
    }
    
    public boolean observation(String searchedBirdName) {
        for (Bird bird: this.listOfBirds) {
            String birdName = bird.getName();
            if (birdName.equals(searchedBirdName)){
                bird.addObservation();
                return true;
            }
        }
        return false;
    }
    
    public void printList() {
        for (Bird bird: this.listOfBirds) {
            System.out.println(bird);
        }
    }
    
    public void printOne(String searchedBirdName) {
        if (this.listOfBirds.size() != 0) {
            for (Bird bird: this.listOfBirds) {
                String birdName = bird.getName();
                if (birdName.equals(searchedBirdName)){
                    System.out.println(bird);
                }
            }    
        }
    }
}
