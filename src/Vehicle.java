public class Vehicle {
    String brand;
    int capacity;

    Vehicle() {

    }

    Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle constructor !");
    }

    public void drive() {
        System.out.println("Jadę !!");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    public String show() {
        return "to jest moj vehicle !!";
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Vehicle)) {
            return false;
        }

        return this.brand.equals(((Vehicle) o).brand)
                && this.capacity == ((Vehicle) o).capacity;
    }
}
