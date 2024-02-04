package oop1;

public class ValueObjectMain {

    public static void main(String[] args) {
        // 속성과 기능이 하나에 뭉쳐 있다 . 객체 지향 프로그래밍 개념
        ValueData valueData = new ValueData();
        valueData.add();
        valueData.add();
        valueData.add();
        System.out.println("최종 숫자 =" + valueData.value);
        // 객체 변수 뒤에 .(dot) 을 찍어서 필드를 불러올 수도 있고 , 메서드를 불러올 수 도 있고
    }

}
