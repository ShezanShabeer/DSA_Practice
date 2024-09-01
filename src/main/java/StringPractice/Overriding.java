package StringPractice;

public class Overriding {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Car", "4wheel");
        v1.vehicleType();
        Car c1 = new Car("Car", "sedan");
        c1.vehicleType();
    }
}
class Vehicle{
    private String vehicle;
    private String type;

    public void vehicleType(){
        System.out.println("Vehicle type is : "+type);
    }

    Vehicle(String vehicle, String type){
        this.type = type;
        this.vehicle = vehicle;
    }
}
class Car extends Vehicle {

    private String type;
    Car(String vehicle, String type) {
        super(vehicle, type);
        this.type = type;
    }

    public void vehicleType(){
        System.out.println("Car class vehicle type : "+type);
    }
}
