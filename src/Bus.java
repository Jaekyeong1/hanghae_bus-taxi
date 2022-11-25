public class Bus extends PublicTransport {   // 상속
    int remainingSeats = 30;


    public void bus(int number1, int number2) {
        number1 = (int) (Math.random() * (9999 - 1000 + 1)) + 1000;   //난수 4자리 랜덤
        number2 = (int) (Math.random() * (9999 - 1000 + 1)) + 1000;
        System.out.println("첫번째 버스번호 : " + number1);
        System.out.println("두번째 버스번호 : " + number2);

        if (number1 != number2) {
            this.status = "운행중";
        } else {
            System.out.println("동일한 버스입니다.");
        }
    }

    public void Boarding(int passenger) { // 시나리오에 나온 승객수
        if (this.status == "운행중") {
            if (passenger <= 4) {     //최대 4명까지 탑승
                this.currentPassengerCount += passenger;    // 현재 탑승객 수에 탑승객수를 더함
                this.remainingSeats -= passenger;   // 자리수 4에 탑승객 수만큼 뺌
                this.target = target;
                this.targetDistance = targetDistance;
                this.status = "운행중";
                this.price += 3000 + 1000 * (this.targetDistance - 1);  //기본요금 3000원 + 거리당 요금 1000 * 거리( -1은 기본 거리)

                System.out.println("탑승 승객 수 : " + this.currentPassengerCount);
                System.out.println("잔여 승객 수 : " + this.remainingSeats);
                System.out.println("기본 요금 확인 : " + 3000);
                System.out.println("목적지 : " + this.target);
                System.out.println("목적지까지 거리 : " + this.targetDistance + "km");
                System.out.println("지불할 요금 : " + this.price);
                System.out.println("상태 : " + this.status);
            } else {
                System.out.println("최대 승객 수 초과 입니다.");
            }
        } else {
            System.out.println("운행 불가입니다.");
        }
    }


    public void Payment() {
        if (this.status == "운행중") {
            if (fuel >= 10) {
                this.status = "일반";
                System.out.println("주유량 : " + this.fuel);
                System.out.println("상태 : " + this.status);
                System.out.println("누적 요금 : " + this.price);
            } else {
                this.status = "운행불가";
                System.out.println("주유량 : " + this.fuel);
                System.out.println("상태 : " + this.status);
                System.out.println("누적 요금 : " + this.price);
                System.out.println("주유가 필요한 상태입니다.");

            }
        }
    }
}

