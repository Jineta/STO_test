package Service;

public abstract class Service <T extends Vehicle> implements Repair<T> {
    String serviceName;

    public String getServiceName() {
        return serviceName;
    }
public abstract void checkInVehicle(T vehicle);
public abstract void checkOutVehicle(T vehicle);

@Override
    public String toString(){
    return "Service name "+ this.serviceName;
}
}
