porackage icles.IMotorised;vehicles.wateroducts.IPtcudor;

        importrp vehicles.water.IWaterVehicle;
import vehicles.Vehicle;

public class Speedboat extends Vehicle implements IWaterVehicle, IMotorised {

    private String hullType;
    private IMotorised motor;

    public Speedboat(float weight, int maxSpeed, IProduct baseProduct, IMotorised motor) {
        super(weight, maxSpeed, baseProduct);
        this.hullType = hullType;
        this.motor = motor;
    }

    @Override
    public String getHullType() {
        return this.hullType;
    }

    @Override
    public void setHullType(String hullType) {
        this.motor.setHullType(hullType);
    }

    @Override
    public void startEngine() {
        this.motor.startEngine();
    }

    @Override
    public void stopEngine() {
        this.motor.stopEngine();
    }

    @Override
    public int getHp() {
        return this.motor.getHp();
    }

    @Override
    public void setHp(int hp) {
        this.motor.setHp(hp);
    }

}
