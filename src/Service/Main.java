package Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Service> serviceList = new ArrayList<>();
    public static Vehicle passengerCar = new PassengerCar();

    public static void main(String[] args) throws IOException {


        serviceList =CreateServiceList.fillServiceList(GetParameter.getAmountService());
        System.out.println();
        //Print Service
        PrintList.printServiceList(serviceList);
        System.out.println("Create passenger car:");
        Vehicle passengerCar = new PassengerCar.Builder()
                .withHealthStatus(HealthStatus.UNKNOWN)
                .withServiceStatus(ServiceStatus.UNKNOWN)
                .withModel(GetParameter.getVehicleModel())
                .withMaxPassengers(GetParameter.getMaxPassengers())
                .build();
        System.out.println("Create truck:");
        Vehicle truck = new Truck.Builder()
                .withHealthStatus(HealthStatus.UNKNOWN)
                .withServiceStatus(ServiceStatus.UNKNOWN)
                .withModel(GetParameter.getVehicleModel())
                .withMaxLoad(GetParameter.getMaxLoad())
                .build();

        System.out.println(passengerCar.toString());
        System.out.println(truck.toString());

       for (int i=0;i< serviceList.size(); i++) {
       if ((serviceList.get(i) instanceof ServiceForPassengerCar)|| (serviceList.get(i) instanceof ServiceForAll)) {
                      serviceList.get(i).repair(passengerCar);
                      System.out.println(passengerCar.toString());
       }
       if ((serviceList.get(i) instanceof ServiceForTruck)|| (serviceList.get(i) instanceof ServiceForAll)) {
                serviceList.get(i).repair(truck);
                System.out.println(truck.toString());}
   }
    }
}


/*
all.get(0).repair(car)
У нас есть 3 вида СТО.
1. Только для легковых автомобилей.
2. Только для грузовых автомобилей.
3. Для любых автомобилей.
(это уже 5 классов в общей сложности).
Проверку какой автомобиль может заезжать на СТО - только через GENERIC

Все СТО должны уметь ремонтировать автомобили (ожидается интерфейс).
Ожидается, что у СТО будет такие методы:
Завести автомобиль на стоянку.
Починить автомобиль.
Выдать автомобиль владельцу.

Ожидается, что в конце у тебя будет вот такой код:

List<????> всеСТО  = ...
// тут ты добавляешь СТО и машины к ним.

for(Sto sto: всеСТО) {
sto.repair()
}


Задача для подумать.
В конце, нужно будет написать код так, чтоб мы могли добавлять бесконечное кол-во СТО для разных типов автомобилей, и весь старый код не менялся (а только добавлялся новый).

Например, мы можем сказать что мы добавим СТО который принимает самолёты (хех), или только мотоциклы.

Конечно все по методам и.т.д

*/