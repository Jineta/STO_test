package Vehicle;

import Main.HealthStatus;
import Main.ServiceStatus;
import lombok.Builder;
import lombok.Getter;


@Getter
public class PassengerCar extends Vehicle {
   private int maxPassengers;
    @Builder
    public PassengerCar(HealthStatus healthStatus, ServiceStatus serviceStatus, String model, int maxPassengers) {
        super(healthStatus, serviceStatus, model);
        this.maxPassengers = maxPassengers;
    }

    @Override
    public String toString() {
        return "PassengerCar: Model " + this.model + ", max passengers"+ this.maxPassengers+ ", service status " + this.serviceStatus + ", health status " + this.healthStatus;

    }
}