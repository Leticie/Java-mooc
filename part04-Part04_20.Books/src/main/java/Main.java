import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        ArrayList<Books> booksArray = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            
            if (title.equals("")) {
                break;
            }
            
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            
            booksArray.add(new Books(title, pages, year));
            
        }
        
        System.out.println("What information will be printed? ");
        String answer = scanner.nextLine();
        
        if (answer.equals("everything")) {
            for (Books book: booksArray) {
                System.out.println(book);
            }    
        } else if (answer.equals("name")) {
            for (Books book: booksArray) {
                System.out.println(book.getName());
            }    
        }
        
        

    }
}
