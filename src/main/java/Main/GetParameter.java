package Main;
import java.io.BufferedReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetParameter {
    static BufferedReader b_reader = new BufferedReader(new InputStreamReader(System.in));

    public static int getAmountService() throws IOException {
        //amount of workers
        System.out.println("Enter amount of services: ");
        int amountServices = Integer.parseInt(b_reader.readLine()); // 2
        return amountServices;
    }

    public static String getServiceName() throws IOException  {
        //Get ServiceName
        System.out.println("Enter service name:");
        String name = b_reader.readLine();
        return name;
    }
    public static int getServiceType() throws IOException  {
        //Get ServiceType
        System.out.println("Enter service type (1-forTruck, 2-forPassenger, 3-forAll):");
        int serviceType = Integer.parseInt(b_reader.readLine());
        return serviceType;
    }
    public static int getCarType() throws IOException  {
        //Get CarType
        System.out.println("Enter car type (1-Truck, 2-Passenger:");
        int carType = Integer.parseInt(b_reader.readLine());
        return carType;
    }
    public static String getVehicleModel() throws IOException  {
        System.out.println("Enter vehicle model:");
        String vehicleModel = b_reader.readLine();
        return vehicleModel;
    }

    public static int getMaxPassengers() throws IOException  {
        System.out.println("Enter maxPassengers:");
        int maxPassengers = Integer.parseInt(b_reader.readLine());
        return maxPassengers;
    }

    public static int getMaxLoad() throws IOException  {
        System.out.println("Enter maxLoad:");
        int maxLoad = Integer.parseInt(b_reader.readLine());
        return maxLoad;
    }

}
