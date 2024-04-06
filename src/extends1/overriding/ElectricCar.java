package extends1.overriding;

public class ElectricCar extends Car {

    @Override // 없어도 input , output 을 맞추면 동작하지만 코드의 명확성을 위해서 붙여주는게 좋다 . 컴파일에러 찾기도 쉽다.
    public void move(){
        System.out.println("전기차를 빠르게 이동합니다.");
    }
    public void charge(){
        System.out.println("충전합니다.");
    }
}
