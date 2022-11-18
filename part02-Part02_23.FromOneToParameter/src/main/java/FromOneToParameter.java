

public class FromOneToParameter {

    public static void main(String[] args) {

        printUntilNumber(3);
    }
    
    public static void printUntilNumber(int finalNumber){
        for (int i = 1; i <= finalNumber; i++) {
            System.out.println(i);
        }
    }

}
