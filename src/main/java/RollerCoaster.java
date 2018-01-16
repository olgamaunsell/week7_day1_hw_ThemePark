public class RollerCoaster extends Ride {

    public RollerCoaster(double price, int minAge, int height){
        super(price, minAge, height);

    }

    public String charge(Customer customer){
        return "You are charged £" + getPrice() + " and are going on the rollercoaster !";
    }

}
