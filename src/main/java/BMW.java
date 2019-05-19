public class BMW implements Car {
    CarName carName;

    public BMW(CarName carName) {
        this.carName = carName;

    }

    public void drive() {
        System.out.println(carName.getName()+" have drove");

    }

    public void stop() {
        System.out.println(carName.getName()+" have stoped");

    }
}
