package Vehicle;

import Main.GetParameter;
import Main.HealthStatus;
import Main.ServiceStatus;

import java.io.IOException;

public class PassengerCarFactory implements VehicleFactory {
    @Override
    public PassengerCar createVehicle() throws IOException {
        System.out.println("Create passenger car:");
        PassengerCar passengerCar = PassengerCar.builder()
                .healthStatus(HealthStatus.UNKNOWN)
                .serviceStatus(ServiceStatus.UNKNOWN)
                .model(GetParameter.getVehicleModel())
                .maxPassengers(GetParameter.getMaxLoad())
                .build();
        return passengerCar;
    }
}
