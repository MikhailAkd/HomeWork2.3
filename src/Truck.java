public class Truck extends Transport implements ServiceWheels, ServiceEngine, ServiceTrailer {

    public Truck(String name, int wheels) {
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
        System.out.println("Меняем покрышку грузовика");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовика");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп грузовика");
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем грузовик " + getName());
        System.out.println();
        checkWheels();
        checkEngine();
        checkTrailer();
    }
}
