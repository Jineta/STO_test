package Service;

import Main.GetParameter;
import Vehicle.PassengerCar;

import java.io.IOException;

public class ServiceForPassengerCarFactory implements ServiceFactory {
    @Override
    public Service<PassengerCar> createService() throws IOException {
        System.out.println("Create service for passenger car:");

        Service<PassengerCar> service = ServiceForPassengerCar.builder()
                .serviceName(GetParameter.getServiceName())
                .build();
        return service;
    }
}
