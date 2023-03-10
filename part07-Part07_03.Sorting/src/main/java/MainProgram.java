
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {8, 3, 7, 9, 1, 2, 4};
        sort(array);
    }
    
    public static int smallest(int[] array){
        int smallestNumber = array[0];
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallestNumber) {
                smallestNumber = array[i];
            }
        }
        return smallestNumber;
    }
    
    public static int indexOfSmallest(int[] array){
        int smallestNumber = array[0];
        int smallestNumberIndex = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallestNumber) {
                smallestNumber = array[i];
                smallestNumberIndex = i;
            }
        }
        return smallestNumberIndex;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestNumber = table[startIndex];
        int smallestNumberIndex = startIndex;
        
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallestNumber) {
                smallestNumber = table[i];
                smallestNumberIndex = i;
            }
        }
        return smallestNumberIndex;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int helper = array[index1];
        array[index1] = array[index2];
        array[index2] = helper;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallestNumberIndex = indexOfSmallestFrom(array, i);
            swap(array, smallestNumberIndex, i);
            System.out.println(Arrays.toString(array));
        } 
    }
}
