public abstract class Ride {

    private double price;
    private int minAge;
    private int height;

    public Ride(double price, int minAge, int height){
        this.price = price;
        this.minAge = minAge;
        this.height = height;
    }

    public double getPrice() {
        return this.price;
    }

    public int getMinAge() {
        return this.minAge;
    }


    public int getHeight() {
        return this.height;
    }
}
