public class Car extends Transport implements Vehicle {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем автомобиль " + getModelName());
        int wheelsCount = getWheelsCount();
        for (int i = 0; i < wheelsCount; i++) {
            System.out.println("Меняем покрышку " + (i+1));
        }
        System.out.println("Проверка двигателя");
        
    }
}
