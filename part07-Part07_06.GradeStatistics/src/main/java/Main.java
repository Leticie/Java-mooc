

public class Main {

    public static void main(String[] args) {
        Points points = new Points();
        UserInterface userInterface = new UserInterface();
        
        userInterface.start(points);
        
        userInterface.printAverageAll(points);
        userInterface.printAveragePassing(points);
        userInterface.printPassPercentage(points);
        userInterface.printStars(points);
    }
}
