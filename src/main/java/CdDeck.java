import java.util.ArrayList;

public class CdDeck extends Component implements IPlay {
    private boolean playing;
    private int capacity;
    private ArrayList<String> cds;
    
    public CdDeck(String make, String model, int capacity) {
        super(make, model);
        this.capacity = capacity;
        this.playing = false;
        this.cds = new ArrayList<String>();
    }

    public void play() {
        if (countCds() > 0) {
            this.playing = true;
        }
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void stop() {
        this.playing = false;
    }

    public boolean isPlaying() {
        return this.playing;
    }
    
    public int countCds(){
        return this.cds.size();
    }
    
    public void addCd(String title) {
        if(countCds() < this.capacity){
            this.cds.add(title);
        }
    }

    public void removeCd(String title) {
        this.cds.remove(title);
    }
}
