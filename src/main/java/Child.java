public class Child extends Customer {

    public Child(int age, int height, double money){
        super(age, height, money);

    }

    public String askQuestion(String ride) {

        return super.askQuestion(ride) + " go faster ?";
    }
}
