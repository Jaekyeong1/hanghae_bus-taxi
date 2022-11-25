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


    public void Boarding(int passenger){
        if(this.status == "운행중"){
            if(passenger > 30){
                System.out.println("최대 승객 수 초과");
            }else{
                this.currentPassengerCount += passenger;
                this.maxPassengerCount -= passenger;
                this.price += 1000 * passenger; // 인당 1000원이니 기본요금 1000원에 * 인원수만큼
                System.out.println("탑승 승객 수 : " +this.currentPassengerCount);
                System.out.println("잔여 승객 수 : " +this.maxPassengerCount);
                System.out.println("요금 확인 : " +this.price);
            }
        }
    }

}

