class Bus extends PublicTrans {      // 버스 이용시
    int current_passenger = 0;  //현재 승객수
    int maximum = 30;       //최대 승객 수 = 30
    boolean base_state = true;   //상태 = 운행
    int pay = 1000;         //요금 = 1000

    void Bus() {
        this.num = (int)(Math.random() * 100 + 1);
        System.out.println("버스 번호 = " + num);
    }

    int ridePassenger(int passenger) {
        this.current_passenger = passenger;
        if (this.current_passenger > this.maximum) {
            System.out.println("!최대 승객 수 초과!");
        }
        return this.current_passenger;
    }

    void currentPrint(int passenger) {
        this.maximum -= this.current_passenger;
        this.pay *= passenger;
        System.out.println("탑승 승객 수 = " + passenger);
        System.out.println("잔여 승객 수 = " + maximum);
        System.out.println("요금 확인 = " + pay);
    }
    int checkOil(int oil) {
        if (!this.base_state){
            System.out.println("상태 = 차고지행");
        }
        this.base_oil += oil;
        System.out.println("주유량 = " + this.base_oil);
        if (this.base_oil <= 10) {
            System.out.println("!주유 필요!");
        }
        return base_oil;
    }

    boolean changeState(boolean state) {
        this.base_state = state;
        return this.base_state;
    }


}