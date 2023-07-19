package vehicles.air;

import products.IProduct;
import vehicles.IMotorised;
import vehicles.Vehicle;

public class Helicopter extends Vehicle implements IAirVehicle, IScanner, IMotorised {

    private int rotors;
    private int altitude;
    private IMotorised engine;
    private IScanner radar;

    public Helicopter(int weight, int maxSpeed, IProduct baseProduct, IMotorised engine, IScanner radar) {
        super(weight, maxSpeed, baseProduct);
        this.rotors = 4;
        this.altitude = 30000;
        this.engine = engine;
        this.radar = radar;
    }


    @Override
    public void startEngine() {
        this.engine.startEngine();
    }

    @Override
    public void stopEngine() {
        this.engine.stopEngine();
    }

    @Override
    public int getHp() {
        return this.engine.getHp();
    }

    @Override
    public void setHp(int hp) {
        this.engine.setHp(hp);
    }

    @Override
    public int getFuel() {
        return this.engine.getFuel();
    }

    @Override
    public void setFuel(int fuel) {
        this.engine.setFuel(fuel);
    }

    @Override
    public int getAltitude() {
        return this.altitude;
    }

    @Override
    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    @Override
    public boolean takeOff() {
        return true;
    }

    @Override
    public int getFrequency() {
        return this.radar.getFrequency();
    }

    @Override
    public void setFrequency(int frequency) {
        this.radar.setFrequency(frequency);
    }
}
