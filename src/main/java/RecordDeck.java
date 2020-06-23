public class RecordDeck extends Component implements IPlay {
    private boolean playing;
    
    public RecordDeck(String make, String model){
        super(make, model);
        this.playing = false;
    }
    
    public void play() {
        this.playing = true;
    }
    
    public void stop() {
        this.playing = false;
    }
    
    public boolean isPlaying() {
        return playing;
    }
}
