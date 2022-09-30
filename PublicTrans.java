class PublicTrans { //대중교통

    //멤버변수
    int num;            //번호
    int base_oil = 100;  //주유량
    int speed = 0;      //속도
    int change_speed;   //속도변경
    int maximum;        //최대승객수
    boolean base_state;       //상태

    //기본 생성자
    public PublicTrans() {
        // 인스턴스시 생성시 수행할 명령
        // 인스턴스의 맴버변수 초긱값 설정
    }

    //메서드(함수)
    public void drive() {}             //운행시작
    public void setChange_speed() {}  //속도변경

}