public class Bicycle extends Transport implements ServiceWheels {

    public Bicycle(String name, int wheels) {
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
        System.out.println("Меняем велосипедную покрышку");
    }

    @Override
    public void service(){
        System.out.println("Обслуживаем велосипед " + getName());
        System.out.println();
        checkWheels();
    }
}
