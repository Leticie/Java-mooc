
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        s.add("Value");
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        String taken = s.take();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        System.out.println(taken);
        
        Stack p = new Stack();
        p.add("d93529");
        p.add("ca20ab");
        p.add("d92fcd");
        System.out.println(p.take());
        System.out.println(p.take());
        System.out.println(p.take());
    }
}
