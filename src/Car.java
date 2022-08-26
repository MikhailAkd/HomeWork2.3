public class Car extends Transport implements ServiceWheels, ServiceEngine {

    public Car(String name, int wheels) {
        super(name, wheels);
    }

    @Override
    public void checkWheels() {
        for (int i = 0; i < getWheels(); i++) {
            updateTyre();
        }
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем автомобильную покрышку");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель автомобиля");
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем автомобиль " + getName());
        System.out.println();
        checkWheels();
        checkEngine();
    }
}
