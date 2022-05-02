package Vehicle;

import Main.HealthStatus;
import Main.ServiceStatus;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Vehicle {

    HealthStatus healthStatus;
    ServiceStatus serviceStatus;
    String model;


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

