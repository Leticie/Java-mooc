
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfNumbers = 0;
        int sumOfNumbers = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number != 0) {
                sumOfNumbers = sumOfNumbers +  number;
                numberOfNumbers = numberOfNumbers + 1;
                System.out.println(sumOfNumbers);
                System.out.println(numberOfNumbers);
            } else {
                double average = (double) sumOfNumbers / numberOfNumbers;
                System.out.println("Average of the numbers: " + average);
                break;
            }
        }
    }
}
