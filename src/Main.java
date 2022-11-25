public class Main {
    public static void main(String[] args) {

        int busNumber;  //버스번호


        for(int i = 0; i < 100; i++) {
            busNumber = (int) (Math.random() * (9999 - 1000 + 1)) + 1000;
            System.out.println("버스번호 : " + busNumber);
        }
    }
}