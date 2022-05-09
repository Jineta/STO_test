package Service;

import Main.GetParameter;
import Vehicle.Vehicle;

import java.io.IOException;

public class ServiceForAllFactory implements ServiceFactory {
    @Override
    public Service<Vehicle> createService() throws IOException {
        System.out.println("Create service for all:");

        Service<Vehicle> service = ServiceForAll.builder()
                .serviceName(GetParameter.getServiceName())
                .build();
        return service;
    }
}
