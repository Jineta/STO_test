package Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreateServiceList {
    static   List<Service> serviceList = new ArrayList<>();
    public static int serviceType;
    public static String serviceName;
    public static List<Service> fillServiceList(int amountServices) throws IOException {
        System.out.println("Let us create services:");
        while (serviceList.size() < amountServices) {
            serviceType = GetParameter.getServiceType();
            serviceName = GetParameter.getServiceName();
            Service tempService;
            switch (serviceType) {
                case 1:
                tempService = new ServiceForTruck.Builder()
                        .withServiceName(serviceName)
                        .build();
                serviceList.add(tempService);
                break;
                case 2:
                tempService = new ServiceForPassengerCar.Builder()
                        .withServiceName(serviceName)
                        .build();
                serviceList.add(tempService);
                break;
                case 3:
                tempService = new ServiceForAll.Builder()
                        .withServiceName(serviceName)
                        .build();
                serviceList.add(tempService);
                break;

                default:
                System.out.println("Invalid record is not added");
                break;
            }
        }
        return serviceList;
    }
}