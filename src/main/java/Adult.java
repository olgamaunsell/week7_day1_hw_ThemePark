public class Adult extends Customer {

    public Adult(int age, int height, double money){
        super(age, height, money);

    }

    public String askQuestion(String ride) {

        return super.askQuestion(ride) + " go slower ?";
    }
}

