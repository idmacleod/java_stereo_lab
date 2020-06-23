public class RecordDeck extends Component implements IPlay {
    private boolean playing;
    private Speed speed;
    enum Speed { SLOW, MEDIUM, FAST; }

    public RecordDeck(String make, String model){
        super(make, model);
        this.playing = false;
        this.speed = Speed.MEDIUM;
    }
    
    public void play() {
        this.playing = true;
    }
    
    public void stop() {
        this.playing = false;
    }
    
    public boolean isPlaying() {
        return this.playing;
    }

    public Speed getSpeed() {
        return this.speed;
    }

    public void setSpeed(Speed speed) {
        if (!isPlaying()) {
            this.speed = speed;
        }
    }
}
