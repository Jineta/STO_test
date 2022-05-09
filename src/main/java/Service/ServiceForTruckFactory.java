package Service;

import Main.GetParameter;
import Vehicle.Truck;
import java.io.IOException;

public class ServiceForTruckFactory implements ServiceFactory {
    @Override
    public Service<Truck> createService() throws IOException {
        System.out.println("Create service for truck:");

        Service<Truck> service = ServiceForTruck.builder()
                .serviceName(GetParameter.getServiceName())
                .build();
        return service;
    }
}
