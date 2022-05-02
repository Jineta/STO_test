package Service;

import Main.HealthStatus;
import Main.ServiceStatus;
import Vehicle.Truck;

public class ServiceForTruck<T extends Truck> extends Service<T> {

 public static class Builder{
     private ServiceForTruck newServiceForTruck;
     public Builder() {newServiceForTruck = new ServiceForTruck();}
     public Builder withServiceName(String serviceName) {
         newServiceForTruck.serviceName  = serviceName;
         return this;
     }
     public ServiceForTruck build() {return newServiceForTruck;}
 }

    @Override
    public void checkInVehicle (T t){
        t.setServiceStatus(ServiceStatus.CHECKED_IN);
        t.setHealthStatus(HealthStatus.BROKEN);
    }
    @Override
    public  void repair(T t){
        t.setServiceStatus(ServiceStatus.IN_PROGRESS);
        t.setHealthStatus(HealthStatus.BROKEN);
        System.out.println("Vehicle " + t.getModel() + " is fixed in ServiceForTruck " + serviceName + " " );
    }
    @Override
    public void checkOutVehicle (T t){
        t.setServiceStatus(ServiceStatus.UNKNOWN);
        t.setHealthStatus(HealthStatus.HEALTHY);
    }

}
