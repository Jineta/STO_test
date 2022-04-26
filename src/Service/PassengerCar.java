package Service;

public class PassengerCar extends Vehicle {
    int maxPassengers;

    public static class Builder {
        private PassengerCar newPassengerCar;

        public Builder() {
            newPassengerCar = new PassengerCar();
        }

        public PassengerCar.Builder withHealthStatus(HealthStatus healthStatus) {
            newPassengerCar.healthStatus = healthStatus;
            return this;
        }

        public PassengerCar.Builder withServiceStatus(ServiceStatus serviceStatus) {
            newPassengerCar.serviceStatus = serviceStatus;
            return this;
        }

        public PassengerCar.Builder withModel(String model) {
            newPassengerCar.model = model;
            return this;
        }

        public PassengerCar.Builder withMaxPassengers(int maxPassengers) {
            newPassengerCar.maxPassengers = maxPassengers;
            return this;
        }

        public PassengerCar build() {
            return newPassengerCar;
        }
    }

    @Override
    public String toString() {
        return "PassengerCar: Model " + this.model + ", max passengers"+ this.maxPassengers+ ", service status " + this.serviceStatus + ", health status " + this.healthStatus;

    }
}