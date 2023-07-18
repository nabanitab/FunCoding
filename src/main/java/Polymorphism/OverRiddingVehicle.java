package Polymorphism;

public class OverRiddingVehicle {

    public void start() {
        System.out.println("Vehicle started.");
    }

    public class OverRiddingCar extends OverRiddingVehicle {

        @Override
        public void start() {
            System.out.println("Car started.");
        }

    }

    public class OverRiddingMAin {

        /*OverRiddingVehicle overRiddingVehicle = new OverRiddingVehicle();
        overRiddingVehicle.start(); // Output: Vehicle started.

        Polymorphism.OverRiddingCar car = new Polymorphism.OverRiddingCar();
        car.start(); // Output: Car started.

        OverRiddingVehicle carAsVehicle = new Polymorphism.OverRiddingCar();
        carAsVehicle.start(); // Output: Car started.*/
    }

}
