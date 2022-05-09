package Vehicle;

import Main.HealthStatus;
import Main.ServiceStatus;
import lombok.Builder;
import lombok.Getter;

@Getter
public class Truck extends Vehicle {
    private int maxLoad;
    @Builder
    public Truck(HealthStatus healthStatus, ServiceStatus serviceStatus, String model, int maxLoad) {
        super(healthStatus, serviceStatus, model);
        this.maxLoad = maxLoad;
    }

    @Override
    public String toString() {
        return "Truck: Model " + this.model + ", max load"+ this.maxLoad+ ", service status " + this.serviceStatus + ", health status " + this.healthStatus;

    }

}
