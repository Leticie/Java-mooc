
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
    private Scanner scanner;
    
    public UserInterface() {
        this.scanner = new Scanner(System.in);
    }
    
    public void start(Points points) {
        System.out.println("Enter point totals, -1 stops:");
        int input = Integer.valueOf(scanner.nextLine());
        points.add(input);
        while (input != -1) {
            input = Integer.valueOf(scanner.nextLine());
            points.add(input);
        }
    }
    
    public void printAverageAll(Points points) {
        System.out.println("Point average (all): " + points.averageAll());
    }
    
    public void printAveragePassing(Points points) {
        if (points.averagePassing() == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + points.averagePassing());
        }    
    }
    
    public void printPassPercentage(Points points) {
        System.out.println("Pass percentage: " + points.passPercentage());
    }

    public void printStars(Points points) {
        points.pointsIntoStars();
        String[] stars = points.getStars();
        for (int i = 5; i >= 0; i--) {
            System.out.println((i) + ": " + stars[i]);
        }
    }
}
