public class Bus extends Vehicle {
    int iloscMiejsc;

    Bus() {
        System.out.println("Bus constructor !");
        System.out.println(5);
    }

    public String show() {
        return "ASD";
    }

    @Override
    public String toString() {

        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
