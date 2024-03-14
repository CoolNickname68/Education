
// Сервисная станция работает с транспортными средствами через общий интерфейс
// Класс для сервисной станции
public class ServiceStation {
    public void check(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.updateTyre();
        }
        if (vehicle instanceof Truck) {
            ((Truck) vehicle).checkEngine();
            ((Truck) vehicle).checkTrailer();
        } else if (vehicle instanceof Car) {
            ((Car) vehicle).checkEngine();
        }
    }
}
