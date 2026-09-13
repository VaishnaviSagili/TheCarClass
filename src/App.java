public class App {
    public static void main(String[] args) throws Exception {
        Car car1 = new Car("Toyota", "Camry", 14, 32);
        Car car2 = new Car("Ford", "F-150", 26, 20);

        car1.drive(200);
        car1.refuel(5);

        car2.drive(150);
        System.out.println(car2.getMake() + " " + car2.getModel() + " has " + car2.getCurrentFuel() + " gallons left.");



    }
}
