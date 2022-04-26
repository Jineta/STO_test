package Service;

import java.util.List;
public class PrintList {

    //Print full workers list
    public static void printServiceList(List<Service> serviceList) {
        System.out.println("List of existing services:");
        for (int i = 0; i < serviceList.size(); i++) {
            System.out.println(serviceList.get(i)); // можем не использовать .toString в print
        }

    }
}