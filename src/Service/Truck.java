package Service;

public class Truck extends Vehicle {
    int maxLoad;
//    public Truck(String name, int maxLoad){
//        super(name);
//        this.maxLoad = maxLoad;
//    }
    public static class Builder{
        private Truck newTruck;
        public Builder()
        {newTruck = new Truck();}
        public Truck.Builder withHealthStatus(HealthStatus healthStatus) {
            newTruck.healthStatus = healthStatus;
            return this;}

        public Truck.Builder withServiceStatus(ServiceStatus serviceStatus) {
            newTruck.serviceStatus = serviceStatus;
            return this;}

        public Truck.Builder withModel(String model) {
            newTruck.model = model;
            return this;}

        public Truck.Builder withMaxLoad(int maxLoad) {
            newTruck.maxLoad = maxLoad;
            return this;
        }
        public Truck build() {return newTruck;}
    }

    @Override
    public String toString() {
        return "Truck: Model " + this.model + ", max load"+ this.maxLoad+ ", service status " + this.serviceStatus + ", health status " + this.healthStatus;

    }

}
