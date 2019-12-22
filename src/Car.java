public class Car extends Vehicle {
    Car() {
        super("Mazda");
        System.out.println("Car constructor !");
    }

    @Override
    public String toString() {
        return "Marka" + this.brand;
    }
}
