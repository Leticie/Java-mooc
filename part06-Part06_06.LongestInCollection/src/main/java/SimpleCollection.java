
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest() {
        if (this.elements.size() == 0) {
            return null;
        }
        
        int longest = 0;
        String longestElement = "";
        for (String element: this.elements) {
            for (int i = 0; i < 10; i++) {
                int lenght = element.length();
                if (lenght > longest) {
                    longest = lenght;
                    longestElement = element;
                }
            }    
        }
        return longestElement;
    }
}
