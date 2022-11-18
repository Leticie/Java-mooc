
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();

    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        for (int number: numbers) {
            if (number <= upperLimit && number >= lowerLimit) {
                System.out.println(number);
            }
        }
    }
    
}
