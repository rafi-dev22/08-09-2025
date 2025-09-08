public class VehicleTester {
    public static void main(String[] args) {
        //cara Membuat objek dari class vehicle
        Vehicle car = new Vehicle(); 
        car.display();

        Vehicle bus = new Vehicle("Mercy", 50, "radial tires ",
         6);
        bus.display();

        Vehicle truck = new Vehicle( "Hino", 30, "Sedan ",
         10);
        truck.display();
    }
}
