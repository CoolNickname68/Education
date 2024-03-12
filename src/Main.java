// Интерфейс для всех типов транспортных средств
interface Vehicle {
    String getModelName();
    void setModelName(String modelName);
    int getWheelsCount();
    void setWheelsCount(int wheelsCount);
    void updateTyre();
    void checkEngine();
}

// Реализация интерфейса для автомобиля
class Car implements Vehicle {

    private String modelName;
    private int wheelsCount;

    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public int getWheelsCount() {
        return wheelsCount;
    }

    @Override
    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}

// Реализация интерфейса для грузовика
class Truck implements Vehicle {

    private String modelName;
    private int wheelsCount;

    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public int getWheelsCount() {
        return wheelsCount;
    }

    @Override
    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}

// Реализация интерфейса для велосипеда
class Bicycle implements Vehicle {

    private String modelName;
    private int wheelsCount;

    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public int getWheelsCount() {
        return wheelsCount;
    }

    @Override
    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void checkEngine() {
        // Велосипеду не требуется проверка двигателя
    }
}

// Сервисная станция работает с транспортными средствами через общий интерфейс
class ServiceStation {
    public void check(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.updateTyre();
        }
        vehicle.checkEngine();
        if (vehicle instanceof Truck) {
            ((Truck) vehicle).checkTrailer();
        }
    }
}

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

