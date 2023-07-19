package vehicles.air;

import vehicles.IVehicle;

public interface IAirVehicle extends IVehicle {

    int getAltitude();
    void setAltitude(int altitude);
    boolean takeOff();

}
