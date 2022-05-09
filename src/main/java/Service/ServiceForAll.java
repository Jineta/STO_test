package Service;

import Main.HealthStatus;
import Main.ServiceStatus;
import Vehicle.Vehicle;
import lombok.Builder;

public class ServiceForAll<T extends Vehicle> extends Service<T> {
    @Builder
    public ServiceForAll(String serviceName) {
        super(serviceName);
    }

    @Override
    public void checkInVehicle (T vehicle){
        vehicle.setServiceStatus(ServiceStatus.CHECKED_IN);
        vehicle.setHealthStatus(HealthStatus.BROKEN);
    }
    @Override
    public void repair(T vehicle){
        vehicle.setServiceStatus(ServiceStatus.IN_PROGRESS);
        vehicle.setHealthStatus(HealthStatus.BROKEN);
        System.out.println("Vehicle " + vehicle.getModel() + " is fixed in ServiceForAll " + this.getServiceName() + " " );
    }
    @Override
    public void checkOutVehicle (T vehicle){
        vehicle.setServiceStatus(ServiceStatus.UNKNOWN);
        vehicle.setHealthStatus(HealthStatus.HEALTHY);
    }
}

