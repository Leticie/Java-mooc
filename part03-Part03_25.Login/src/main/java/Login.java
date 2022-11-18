
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //registered users
        String firstUser = ("alex");
        String secondUser = ("emma");
        String passwordFirstUser = ("sunshine");
        String passwordSecondUser = ("haskell");
        
        //login
        System.out.print("Enter username: ");
        String inputUser = scanner.nextLine();
        System.out.println("");
        System.out.println("Enter password: ");
        String inputPassword = scanner.nextLine();
        System.out.println("");
        
        //security check
        if (inputUser.equals(firstUser) && inputPassword.equals(passwordFirstUser)) {
            System.out.println("You have successfully logged in!");
        } else if (inputUser.equals(secondUser) && inputPassword.equals(passwordSecondUser)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }        
    }
}
