package Service;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Service <T> implements Repair<T>, CheckInVehicle<T>, CheckOutVehicle<T>{
    private  String serviceName;
@Override
    public String toString(){
    return "Service name "+ this.serviceName;
}
}
