public class model {
    public static void main(String[] args) {
//        Bus bus1 = new Bus();
//        Bus bus2 = new Bus();
//        bus1.ridePassenger(2);
//        bus1.currentPrint(bus1.current_passenger);
//        bus1.checkOil(-50);
//        bus1.changeState(false);
//        bus1.checkOil(10);
//        bus1.changeState(true);
//        bus1.ridePassenger(45);
//        bus1.ridePassenger(5);
//        bus1.currentPrint(bus1.current_passenger);
//        bus1.checkOil(-55);

        Taxi taxi1 = new Taxi(2,"서울역",2);
        taxi1.checkOil(-80);
        taxi1.result();

    }
}
