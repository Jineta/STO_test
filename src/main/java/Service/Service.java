package Service;

import Vehicle.Vehicle;

public abstract class Service <T> {
    String serviceName;

    public String getServiceName() {
        return serviceName;
    }
    public abstract void repair(T t);
    public abstract void checkInVehicle(T t);
    public abstract void checkOutVehicle(T t);

@Override
    public String toString(){
    return "Service name "+ this.serviceName;
}
}
