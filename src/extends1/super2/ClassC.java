package extends1.super2;

public class ClassC extends ClassB{
    public ClassC(){
        // 기본 생성자가 아니면 개발자가 직접 값을 지정해줘야 한다.
        super(10, 20);
        System.out.println("ClassC 생성자");
    }
}
