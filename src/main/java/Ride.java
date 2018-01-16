public abstract class Ride implements ICharge{

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

    public String startRide(){
        return "Ride started";
    }

    public String stopRide() {
        return "Ride stopped";
    }

    public abstract String charge(Customer customer);
}
