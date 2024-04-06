package extends1.ex2;



public class CarMain {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();

        

    }
}

// 외부에선 객체가 하나만 생성되는 것 같지만 내부에서는 부모 , 자신 둘다 생성된다.
// 둘다 생성 되었을때 그러면 Car 클래스 에서 찾아야 할까 , ElectricCar 에서 찾아야 할까
// 기준이 되는것은 호출하는 변수의 타입(클래스)을 기준으로 선택한다.
// electricCar 변수의 타입이 ElectricCar이므로 인스턴스 내부에 같은 타입인 ElectricCar 를 통해서 charge() 를 호출한다.
// 호출자인 ElectricCar 로 먼저 찾아가고 없으면 이제 부모타입으로 올라가서 찾는다.