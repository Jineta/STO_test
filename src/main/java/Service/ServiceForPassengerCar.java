package Service;

import Main.HealthStatus;
import Main.ServiceStatus;
import Vehicle.PassengerCar;
import lombok.Builder;


public class ServiceForPassengerCar<T extends PassengerCar> extends Service<T> {

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
    public void checkInVehicle (T t) {
        t.setServiceStatus(ServiceStatus.CHECKED_IN);
        t.setHealthStatus(HealthStatus.BROKEN);
    }
    @Override
    public void repair(T t){
        t.setServiceStatus(ServiceStatus.IN_PROGRESS);
        t.setHealthStatus(HealthStatus.BROKEN);
        System.out.println("Vehicle " + t.getModel() + " is fixed in ServiceForPassengerCar " + serviceName + " " );
    }
    @Override
    public void checkOutVehicle(T t){
        t.setServiceStatus(ServiceStatus.UNKNOWN);
        t.setHealthStatus(HealthStatus.HEALTHY);
    }
}
