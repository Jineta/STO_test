package Vehicle;

import Main.HealthStatus;
import Main.ServiceStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@AllArgsConstructor
public abstract class Vehicle {
    HealthStatus healthStatus;
    ServiceStatus serviceStatus;
    String model;

}

