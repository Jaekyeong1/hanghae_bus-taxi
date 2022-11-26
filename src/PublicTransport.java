import com.sun.jdi.connect.Transport;

public class PublicTransport {
    int maxPassengerCount ;  // 최대승객수
    int currentPassengerCount;   //현재승객수
    int price ;  //요금
    int number;  //버스번호
    int fuel = 100;   // 주유량
    int currentSpeed = 0 ;   //현재속도

    int accel;  //속도변경
    String status ="";

    public void Transport(int number){
        this.number = number;
    }

    public void changeSpeed(int change){
        this.accel = change;
        currentSpeed += accel;
    }

    public void changeFuel(int amount) {
        this.fuel += amount;
    }
    public void boarding(int passenger){
        this.currentPassengerCount += passenger;
        this.maxPassengerCount -= passenger;
    }
}
