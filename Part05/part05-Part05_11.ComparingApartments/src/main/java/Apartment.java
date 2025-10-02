public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

     private int price() {
        return pricePerSquare * squares;
    }


    public boolean largerThan(Apartment compared) {
        if (compared == null) {
            throw new IllegalArgumentException("Cannot compare with null apartment");
            // or return false/true depending on requirements
        }
        return this.squares > compared.squares;
    }

    public int priceDifference(Apartment compared) {
        return Math.abs(this.price() - compared.price());
    }

    public boolean moreExpensiveThan(Apartment compared) {
        if (compared == null) {
            throw new IllegalArgumentException("Cannot compare with null apartment");
        }
        
        return this.price() > compared.price();
    }

}
