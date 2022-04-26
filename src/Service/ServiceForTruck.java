package Service;

public class ServiceForTruck extends Service<Truck> {

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
    public void checkInVehicle (Truck truck){
        truck.setServiceStatus(ServiceStatus.CHECKED_IN);
        truck.setHealthStatus(HealthStatus.BROKEN);
    }
    @Override
    public  void repair(Truck truck){
        truck.setServiceStatus(ServiceStatus.IN_PROGRESS);
        truck.setHealthStatus(HealthStatus.BROKEN);
    }
    @Override
    public void checkOutVehicle (Truck truck){
        truck.setServiceStatus(ServiceStatus.UNKNOWN);
        truck.setHealthStatus(HealthStatus.HEALTHY);
    }

}
