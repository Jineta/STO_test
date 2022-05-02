package Vehicle;

import Main.HealthStatus;
import Main.ServiceStatus;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Truck extends Vehicle {
    private int maxLoad;

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
