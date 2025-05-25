package Session08;

public class Baitap2 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.strat();
        car.setName("Toyota");
        car.setSpeed(120);
        car.displayInfo();
        Vehicle bike = new Bike();
        bike.strat();
        bike.setName("Yamaha");
        bike.setSpeed(80);
        bike.displayInfo();
    }
}
abstract class Vehicle{
    String name;
    int speed;
    public void setName(String newName){
        name = newName;
    }
    public void setSpeed(int newSpeed){
        speed = newSpeed;
    }
    abstract void displayInfo();
    void strat(){
        System.out.println("Vehicle is starting...");
    }
}
class Car extends Vehicle {
    @Override
    void displayInfo(){
        System.out.println("Car Name: "+ name +", "+ "Speed: "+ speed+ " km/h");
    }
}
class Bike extends Vehicle{
    @Override
    void  displayInfo(){
        System.out.println("Bike Name: "+ name +", "+ "Speed: "+ speed + " km/h");
    }
}