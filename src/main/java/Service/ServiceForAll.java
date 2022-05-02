package Service;

import Main.HealthStatus;
import Main.ServiceStatus;
import Vehicle.Vehicle;

public class ServiceForAll<T extends Vehicle> extends Service<T> {
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
    public void checkInVehicle (T t){
        t.setServiceStatus(ServiceStatus.CHECKED_IN);
        t.setHealthStatus(HealthStatus.BROKEN);
    }
    @Override
    public void repair(T t){
        t.setServiceStatus(ServiceStatus.IN_PROGRESS);
        t.setHealthStatus(HealthStatus.BROKEN);
        System.out.println("Vehicle " + t.getModel() + " is fixed in ServiceForAll " + serviceName + " " );
    }
    @Override
    public void checkOutVehicle (T t){
        t.setServiceStatus(ServiceStatus.UNKNOWN);
        t.setHealthStatus(HealthStatus.HEALTHY);
    }
}

