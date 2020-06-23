public class Stereo  {
    private String name;
    private Radio radio;
    private RecordDeck recordDeck;
    private CdDeck cdDeck;
    private int volume;

    public Stereo(String name, Radio radio, RecordDeck recordDeck, CdDeck cdDeck){
        this.name = name;
        this.radio = radio;
        this.recordDeck  = recordDeck;
        this.cdDeck = cdDeck;
        this.volume  = 5;
    }

    public String getName() {
        return this.name;
    }

    public Radio radio() {
        return this.radio;
    }

    public RecordDeck recordDeck() {
        return this.recordDeck;
    }

    public CdDeck cdDeck() {
        return this.cdDeck;
    }

    public int getVolume() {
        return this.volume;
    }

    public String tuneRadio(String station) {
        this.recordDeck.stop();
        this.cdDeck.stop();
        return this.radio.tune(station);
    }

    public void playCd(){
        this.recordDeck.stop();
        this.cdDeck.play();
    }

    public void playRecord(){
        this.cdDeck.stop();
        this.recordDeck.play();
    }

    public void volumeUp(){
        if (this.volume < 10) {
            this.volume += 1;
        }
    }

    public void volumeDown(){
        if (this.volume > 0) {
            this.volume -= 1;
        }
    }
}
