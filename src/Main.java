public class Main {
    public static void main(String[] args) {
        Car mojSamochod = new Car();
        mojSamochod.drive();

        Bus mojBus = new Bus();
        mojBus.drive();

        Amfibia jakasAmfibia = new Amfibia();
        jakasAmfibia.drive();

        System.out.println(5);
        System.out.println(mojBus);

        mojBus.equals(mojSamochod);
    }
}
