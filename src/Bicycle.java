public class Bicycle extends Transport implements Vehicle {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем велосипед " + getModelName());
        int wheelsCount = getWheelsCount();
        for (int i = 0; i < wheelsCount; i++) {
            System.out.println("Меняем покрышку " + (i+1));
        }
    }
}
