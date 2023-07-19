package vehicles.air;

public class Radar implements IScanner{

    private int frequency;

    public Radar(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public int getFrequency() {
        return this.frequency;
    }

    @Override
    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}
