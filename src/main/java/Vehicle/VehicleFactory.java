package Vehicle;
import java.io.IOException;
public interface VehicleFactory {
    Vehicle createVehicle() throws IOException;
}
