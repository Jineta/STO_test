package Main;

import Service.*;
import Vehicle.*;
import lombok.Builder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println();
        //Create cars
        PassengerCar passengerCar = new PassengerCarFactory().createVehicle();
        Truck truck = new TruckFactory().createVehicle();

        System.out.println(passengerCar);
        System.out.println(truck);

// services creation
        Service<Truck> truckService =  new ServiceForTruckFactory().createService();
        Service<PassengerCar> passengerCarService =  new ServiceForPassengerCarFactory().createService();
        Service<Vehicle> serviceForAll =  new ServiceForAllFactory().createService();

        System.out.println("Repair log:");
        truckService.repair(truck);
        passengerCarService.repair(passengerCar);
        serviceForAll.repair(truck);
        serviceForAll.repair(passengerCar);

  }
}