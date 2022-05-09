package Vehicle;
import java.io.IOException;
import Main.GetParameter;
import Main.HealthStatus;
import Main.ServiceStatus;

public class TruckFactory implements VehicleFactory {
    @Override
    public Truck createVehicle()  throws IOException
    {         System.out.println("Create truck:");
        Truck truck =  Truck.builder()
                .healthStatus(HealthStatus.UNKNOWN)
                .serviceStatus(ServiceStatus.UNKNOWN)
                .model(GetParameter.getVehicleModel())
                .maxLoad(GetParameter.getMaxLoad())
                .build();
        return truck;}
}
