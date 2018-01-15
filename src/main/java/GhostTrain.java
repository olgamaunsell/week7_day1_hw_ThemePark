public class GhostTrain extends Ride implements IPlaySong {

    public GhostTrain(double price, int minAge, int height) {
        super(price, minAge, height);
    }

    public String playSong(){
        return "Monster Mash";
    }
}
