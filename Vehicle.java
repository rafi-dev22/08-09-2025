public class Vehicle {
    //properti/Variabelnya
    String make;
     int milesPerGallon; 
     int numberOfWheel;
     String type;

     //constructor biasa = namanya harus sama dengan nama class
     public Vehicle() {
        make = "Lambo";
        milesPerGallon = 120;
        numberOfWheel = 4;
        type = "Pirelli";
     }

        //constructor dengan parameter
        public Vehicle(String make, int milesPerGallon, String type, int numberOfWheel) {
        this.make =make;
        this.milesPerGallon = milesPerGallon;
        this.type =type;
        this.numberOfWheel =numberOfWheel;
         }   

     //method
     public void display() {
        System.out.println("Make " + make);
        System.out.println("Miles per Gallon: " + milesPerGallon);
        System.out.println("type " + type);
        System.out.println("numberOfWheel " + numberOfWheel);
    

     }
}  
