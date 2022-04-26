package Service;

public abstract class Vehicle {

    HealthStatus healthStatus;
    ServiceStatus serviceStatus;
    String model;

//    public Vehicle(String model){
//        healthStatus = HealthStatus.UNKNOWN;
//        serviceStatus =ServiceStatus.UNKNOWN;
//        this.model = model;
//    }
//public static class Builder {
//    private Vehicle newVehicle;
//    public Builder()
//    {newVehicle = new Vehicle();}
//
//    public Vehicle.Builder withHealthStatus(HealthStatus healthStatus) {
//        newVehicle.healthStatus = healthStatus;
//        return this;}
//
//    public Vehicle.Builder withServiceStatus(ServiceStatus serviceStatus) {
//        newVehicle.serviceStatus = serviceStatus;
//        return this;}
//
//    public Vehicle.Builder withModel(String model) {
//        newVehicle.model = model;
//        return this;}
//
//    public Vehicle build() {return newVehicle;}
//    }
//
//    public HealthStatus getHealthStatus() {
//        return healthStatus;
//    }
//
    public void setHealthStatus(HealthStatus healthStatus) {
        this.healthStatus = healthStatus;
    }

    public ServiceStatus getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(ServiceStatus serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

