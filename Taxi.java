import java.sql.SQLOutput;

class Taxi extends PublicTrans {     // 택시 이용시
    int passenger;
    String destination;         //목적지
    int to_distance;            //목적지까지거리
    int base_distance = 1;      //기본거리
    int base_pay = 3000;        //기본요금
    int distance_pay = 1000;    //거리당요금
    int maximum = 4;            //최대 승객 수 = 4
    String base_state = "일반";  //상태 = 일반
    int speed = 0;              //속도 = 0

    Taxi(int passenger, String destination, int to_distance) {
        this.passenger = passenger;
        this.maximum -= this.passenger;
        this.destination = destination;
        this.to_distance = to_distance;
        System.out.println("탑승 승객 수 = " + this.passenger);
        System.out.println("잔여 승객 수 = " + this.maximum);
        System.out.println("기본 요금 확인 = " + this.base_pay);
        System.out.println("목적지 = " + this.destination);
        System.out.println("목적지까지 거리 = " + this.to_distance + "km");
        System.out.println("지불할 요금 = " + (this.base_pay+ this.to_distance*500));
        if (this.passenger>0) {
            this.base_state = "운행중";
            System.out.println("상태 = " + this.base_state );
        }
    }

    void taxiCheck() {
        this.num = (int)(Math.random() * 100 + 1);
        System.out.println("택시 번호 = " + num);
        System.out.println("주유량 = " + this.base_oil);
        System.out.println("상태 = " + this.base_state);
    }

    int checkOil(int oil) {
        this.base_oil += oil;
        return this.base_oil;
    }

    void result() {

    }


    void setDistance_pay() {
    }

    void setPay() {
    }
}