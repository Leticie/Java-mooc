
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class IsItInTheFile {

    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        try (Scanner fileScan = new Scanner(Paths.get(file))) {
            while (fileScan.hasNextLine()) {
                String row = fileScan.nextLine();
                list.add(row);
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + e.getMessage() + " failed.");
        }
        
        int found = 0;
        
        for (String name: list) {
            if (name.equals(searchedFor)) {
                System.out.println("Found!");
                found++;
            }  
        }
        
        if (found == 0) {
            System.out.println("Not found.");
        }    

    }
}
