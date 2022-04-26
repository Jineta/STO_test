package Service;

public class ServiceForPassengerCar extends Service<PassengerCar> {

    public static class Builder{
        private ServiceForPassengerCar newServiceForPassengerCar;
        public Builder()
        {newServiceForPassengerCar = new ServiceForPassengerCar();}
        public ServiceForPassengerCar.Builder withServiceName(String serviceName) {
            newServiceForPassengerCar.serviceName  = serviceName;
            return this;
        }
        public ServiceForPassengerCar build() {return newServiceForPassengerCar;}
    }

    @Override
    public void checkInVehicle (PassengerCar passengerCar) {
        passengerCar.setServiceStatus(ServiceStatus.CHECKED_IN);
        passengerCar.setHealthStatus(HealthStatus.BROKEN);
    }
    @Override
    public void repair(PassengerCar passengerCar){
        passengerCar.setServiceStatus(ServiceStatus.IN_PROGRESS);
        passengerCar.setHealthStatus(HealthStatus.BROKEN);
    }
    @Override
    public void checkOutVehicle(PassengerCar passengerCar){
        passengerCar.setServiceStatus(ServiceStatus.UNKNOWN);
        passengerCar.setHealthStatus(HealthStatus.HEALTHY);
    }
}
