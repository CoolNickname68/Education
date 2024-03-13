
// Основной класс с методом main
public class Main {
    public static void main(String[] args) {
        // Пример использования
        Car car = new Car();
        car.setModelName("car1");
        car.setWheelsCount(4);

        Truck truck = new Truck();
        truck.setModelName("truck1");
        truck.setWheelsCount(6);

        Bicycle bicycle = new Bicycle();
        bicycle.setModelName("bicycle1");
        bicycle.setWheelsCount(2);

        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(truck);
        station.check(bicycle);
    }
}

