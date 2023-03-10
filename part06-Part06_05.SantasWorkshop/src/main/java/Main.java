
public class Main {

    public static void main(String[] args) {


        // use this main method to try out your classes!
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);
        Gift secondBook = new Gift("Hello, world", 5);


        Package gifts = new Package();
        gifts.addGift(book);
        gifts.addGift(secondBook);
        System.out.println(gifts.totalWeight());
    }
}
