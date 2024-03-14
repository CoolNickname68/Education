// Интерфейс для всех типов транспортных средств
public interface Vehicle {
    String getModelName();
    void setModelName(String modelName);
    int getWheelsCount();
    void setWheelsCount(int wheelsCount);
    void updateTyre();
}
