
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        printing(firstContainer, secondContainer);

        while (true) {

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] inputParts = input.split(" ");
            String command = inputParts[0];
            int amount = Integer.valueOf(inputParts[1]);

            if (command.equals("add")) {
                add(amount, firstContainer, secondContainer);
            }

            if (command.equals("move")) {
                move(amount, firstContainer, secondContainer);
            }

            if (command.equals("remove")) {
                remove(amount, firstContainer, secondContainer);
            }
        }
    }

    private static void printing(Container firstContainer, Container secondContainer) {
        System.out.println("First: " + firstContainer);
        System.out.println("Second " + secondContainer);
    }

    private static void move(int amount, Container firstContainer, Container secondContainer) {
        if (amount > firstContainer.contains()) {
            secondContainer.add(firstContainer.contains());
        } else {
            secondContainer.add(amount);
        }

        firstContainer.remove(amount);
        printing(firstContainer, secondContainer);
    }

    private static void add(int amount, Container firstContainer, Container secondContainer) {
        firstContainer.add(amount);
        printing(firstContainer, secondContainer);
    }
    
    private static void remove(int amount, Container firstContainer, Container secondContainer) {
        secondContainer.remove(amount);
        printing(firstContainer, secondContainer);
    }
}
