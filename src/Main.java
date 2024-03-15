public class Main {
    public static void main(String[] args) {
        // Пример использования
        Car car = new Car("car1", 4);
        Truck truck = new Truck("truck1", 6);
        Bicycle bicycle = new Bicycle("bicycle1", 2);

        ServiceStation station = new ServiceStation();
        station.serviceVehicle(car);
        station.serviceVehicle(truck);
        station.serviceVehicle(bicycle);
    }
}


