public class model {
    public static void main(String[] args) {
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();
        bus1.ridePassenger(2);
        bus1.currentPrint(bus1.current_passenger);
        bus1.checkOil(-50);
        bus1.changeState(false);
        bus1.checkOil(10);
        bus1.changeState(true);
        bus1.ridePassenger(45);
        bus1.ridePassenger(5);
        bus1.currentPrint(bus1.current_passenger);
        bus1.checkOil(-55);
        System.out.println("여기부터는 택시입니다");
        Taxi taxi1 = new Taxi();
        Taxi taxi2 = new Taxi();
        taxi1.taxiCheck();
        taxi2.taxiCheck();
        taxi1.taxi(2,"서울역",2);
        taxi1.checkOil(-80);
        taxi1.pay();
        taxi1.result();
        taxi1.getPassenger(5);
        taxi1.taxi(3,"구로디지털단지역",12);
        taxi1.checkOil(-20);
        taxi1.pay();
        taxi1.result();
    }
}
