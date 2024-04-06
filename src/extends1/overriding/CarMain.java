package extends1.overriding;


public class CarMain {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move(); // 실행할 메서드를 이미 찾았으므로 부모타입을 찾지 않는다.
        electricCar.charge();
        electricCar.openDoor();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
        gasCar.openDoor();

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.move();
        hydrogenCar.fillHydrogen();
        hydrogenCar.openDoor();

        

    }
}
// 오버라이딩
// 예외 : 오버라이딩 메서드는 상위 클래스의 메서드보다 더 많은 체크 예외를 throws 로 선언 할 수 없다.
//하지만 더 적거나 같은 수의 예외, 또는 하위 타입의 예외는 선언 할 수 있다.

// static, final, private : 키워드가 붙은 메서드는 오버라이딩  될 수 없다.
// static 은 클래스 레벨에서 작동하므로 인스턴스 레벨에서 사용하는 오버라이딩의 의미가 없다. 그냥 클래스 이름을 통해 필요한 곳에 직접 접근하면 된다.
// final 메서드는 재정의를 금지한다.
// private 메서드는 해당 클래스에서만 접근 가능하기 때문에 하위 클래스에서 보이지 않는다. 따라서 오버라이딩 할 수 없다.