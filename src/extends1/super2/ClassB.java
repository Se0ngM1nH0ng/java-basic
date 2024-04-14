package extends1.super2;

public class ClassB extends ClassA{

    public ClassB(int a){
        super(); // 기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a=" + a);
    }

    public ClassB(int a , int b){
        super(); // 부모클래스의 생성자를 호출 해줘야 한다. 기본 생성자시 생략 가능
        System.out.println("ClassB 생성자 a=" + a + " b=" +b);
    }

}
