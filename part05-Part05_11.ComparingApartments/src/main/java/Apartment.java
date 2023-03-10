
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared) {
        int thisPriceTotal = this.squares * this.princePerSquare;
        int comparedPriceTotal = compared.squares * compared.princePerSquare;
        int difference = 0;
        
        if (thisPriceTotal >= comparedPriceTotal) {
            difference = thisPriceTotal - comparedPriceTotal;
        } else {
            difference = comparedPriceTotal - thisPriceTotal;
        }
        return difference;
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        int thisPriceTotal = this.squares * this.princePerSquare;
        int comparedPriceTotal = compared.squares * compared.princePerSquare;
        
        if (thisPriceTotal > comparedPriceTotal) {
            return true;
        } 
        return false;
    }
   

}
