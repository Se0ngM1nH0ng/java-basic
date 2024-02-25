package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){ // static 이 붙으면 static만 접근
//        instanceValue++; // 인스턴스 변수 접근, compile error
//        instanceMethod(); // 인스턴스 메서드 접근, compile error


        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
                         // 같은 클래스 소속이라
    }
    public void instanceCall(){ // static 이 없으면 가능
        instanceValue++; // 인스턴스 변수 접근
        instanceMethod(); // 인스턴스 메서드 접근


        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
                         // 같은 클래스 소속이라
    }

    private void instanceMethod(){
        System.out.println("instanceValue= " + instanceValue);
    }
    private static void staticMethod(){
        System.out.println("staticValue= " + staticValue);
    }
}
