package Service;

import Main.HealthStatus;
import Main.ServiceStatus;
import Vehicle.Truck;
import lombok.Builder;

public class ServiceForTruck<T extends Truck> extends Service<T> {
    @Builder
    public ServiceForTruck(String serviceName) {
        super(serviceName);
    }

    @Override
    public void checkInVehicle (T vehicle){
        vehicle.setServiceStatus(ServiceStatus.CHECKED_IN);
        vehicle.setHealthStatus(HealthStatus.BROKEN);
    }
    @Override
    public  void repair(T vehicle){
        vehicle.setServiceStatus(ServiceStatus.IN_PROGRESS);
        vehicle.setHealthStatus(HealthStatus.BROKEN);
        System.out.println("Vehicle " + vehicle.getModel() + " is fixed in ServiceForTruck " + this.getServiceName() + " " );
    }
    @Override
    public void checkOutVehicle (T vehicle){
        vehicle.setServiceStatus(ServiceStatus.UNKNOWN);
        vehicle.setHealthStatus(HealthStatus.HEALTHY);
    }

}
