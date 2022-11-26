public class Main {
    public static void main(String[] args) {


        Bus bus = new Bus();

        bus.make();
        bus.boarding(2);
        bus.changeFuel(-50);
        bus.changeStatus();
        bus.changeFuel(10);
        bus.changeStatus();
        bus.boarding(45);
        bus.boarding(5);
        bus.changeFuel(-55);


    }
}