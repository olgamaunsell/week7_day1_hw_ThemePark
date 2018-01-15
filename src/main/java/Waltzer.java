public class Waltzer extends Ride implements IPlaySong {

    public Waltzer(double price, int minAge, int height){
        super(price, minAge, height);

    }

    public String playSong(){
        return "You spin me round";
    }
}

