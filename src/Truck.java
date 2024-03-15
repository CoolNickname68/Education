public class Truck extends Transport implements Vehicle {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем грузовик " + getModelName());
        int wheelsCount = getWheelsCount();
        for (int i = 0; i < wheelsCount; i++) {
            System.out.println("Меняем покрышку " + (i+1));
        }
        System.out.println("Проверка двигателя");
        System.out.println("Проверяем прицеп");
    }
}