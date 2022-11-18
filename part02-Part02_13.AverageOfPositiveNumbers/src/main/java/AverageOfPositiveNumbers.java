
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfNumbers = 0;
        int sumOfNumbers = 0;
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number > 0) {
                sumOfNumbers = sumOfNumbers +  number;
                numberOfNumbers = numberOfNumbers + 1;
            } else if (number == 0) {
                double average = (double) sumOfNumbers / numberOfNumbers;
                if (numberOfNumbers == 0) {
                    System.out.println("Cannot calculate the average");
                }
                System.out.println("Average of the numbers: " + average);
                break;
            }
        }
    }
}
