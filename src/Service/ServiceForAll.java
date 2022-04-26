package Service;

public class ServiceForAll extends Service<Vehicle> {
    public static class Builder{
        private ServiceForAll newServiceForAll;
        public Builder() {newServiceForAll = new ServiceForAll();}
        public ServiceForAll.Builder withServiceName(String serviceName) {
            newServiceForAll.serviceName  = serviceName;
            return this;
        }
        public ServiceForAll build() {return newServiceForAll;}
    }

    @Override
    public void checkInVehicle (Vehicle vehicle){
        vehicle.setServiceStatus(ServiceStatus.CHECKED_IN);
        vehicle.setHealthStatus(HealthStatus.BROKEN);
    }
    @Override
    public void repair(Vehicle passengerCar){
        passengerCar.setServiceStatus(ServiceStatus.IN_PROGRESS);
        passengerCar.setHealthStatus(HealthStatus.BROKEN);
    }
    @Override
    public void checkOutVehicle (Vehicle truck){
        truck.setServiceStatus(ServiceStatus.UNKNOWN);
        truck.setHealthStatus(HealthStatus.HEALTHY);
    }
}

