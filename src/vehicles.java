
// Реализация интерфейса для автомобиля
// Базовый класс для всех транспортных средств
class Vehicle implements Info{
    private String modelName;
    private int wheelsCount;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}

// Класс для автомобилей
class Car extends Vehicle {
    // Дополнительные методы и атрибуты для автомобилей, если нужно
}

// Класс для грузовиков
class Truck extends Vehicle {
    // Дополнительные методы и атрибуты для грузовиков
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}

// Реализация интерфейса для велосипеда
class Bicycle extends Vehicle {


    public void checkEngine() {
        // Для велосипеда не нужна проверка двигателя, поэтому метод остается пустым
    }
}

// Сервисная станция работает с транспортными средствами через общий интерфейс
class ServiceStation {
    public void check(Info vehicle) {
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