package vehicles;

public class Motor implements IMotorised{

    private int fuel;
    private int hp;

    public Motor(int fuelLevel, int hp) {
        this.fuel = fuel;
        this.hp = hp;
    }


    @Override
    public void startEngine() {
        System.out.println("start motor");
    }

    @Override
    public void stopEngine() {
        System.out.println("stop motor");
    }

    @Override
    public int getHp() {
        return this.hp;
    }

    @Override
    public void setHp(int hp) {
this.hp = hp;
    }

    @Override
    public int getFuel() {
        return this.fuel;
    }

    @Override
    public void setFuel(int fuel) {
this.fuel = fuel;
    }
}
