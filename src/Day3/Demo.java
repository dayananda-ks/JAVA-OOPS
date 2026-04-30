package Day3;
class Car {

    public void carisMoving() {
        System.out.println("Car is moving....");
    }
    public void speedOfCar() {
        System.out.println("Speed of the car is 100km/hr");
    }
}
public class Demo {
    public static void main(String[] args) {
        Car car = new Car();
        car.carisMoving();
        car.speedOfCar();

    }
}
