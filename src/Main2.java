public class Main2 {
    public static void main(String[] args) {

        Taxi taxi = new Taxi();

        taxi.make();
        taxi.boarding(2, "서울역", 2);
        taxi.changeFuel(-80);
        taxi.payment();
        taxi.boarding(5, "", 0);
        taxi.boarding(3, "구로디지털단지역", 12);
        taxi.changeFuel(-20);
        taxi.payment();
    }
}