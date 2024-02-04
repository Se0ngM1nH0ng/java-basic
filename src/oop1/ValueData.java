package oop1;

public class ValueData {
    int value;

    // 원칙적으로 메서드는 객체를 생성해야 호출 할 수 있다. 그러나 static 이 붙으면 객체 생성 없이 메서드 호출 가능
    void add(){
        value++;
        System.out.println("숫자 증가 value = " + value);
    }
}
