public class Stereo  {
    private String name;
    private Radio radio;
    private RecordDeck recordDeck;
    private CdDeck cdDeck;
    private int volume;
    private boolean powerOn;

    public Stereo(String name, Radio radio, RecordDeck recordDeck, CdDeck cdDeck){
        this.name = name;
        this.radio = radio;
        this.recordDeck  = recordDeck;
        this.cdDeck = cdDeck;
        this.volume  = 5;
        this.powerOn = false;
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

    public boolean isPowerOn() {
        return this.powerOn;
    }

    public String tuneRadio(String station) {
        return this.radio.tune(station);
    }
}
