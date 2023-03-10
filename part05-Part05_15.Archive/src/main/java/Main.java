
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Data> list = new ArrayList<>();
        
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            
            if (identifier.equals("")) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            
            if (name.equals("")) {
                break;
            }
            
            Data data = new Data(identifier, name);
            
            
            if (!(list.contains(data))) {
                list.add(data);
            }
            
            
        }
        
        System.out.println("==Items==");
        for (Data data: list){
            System.out.println(data);
        }    
        

    }
}
