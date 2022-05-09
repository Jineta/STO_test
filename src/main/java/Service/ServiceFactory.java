package Service;

import Vehicle.Vehicle;

import java.io.IOException;

public interface ServiceFactory {
    Service createService() throws IOException;
}
