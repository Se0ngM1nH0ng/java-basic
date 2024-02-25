package static1;

public class Data3 {
    public String name;
    public static int count; // static // 여기 객체에 바로 접근 하는것으로 보인다

    // name, count 는 멤버 변수 , 필드 이다.
    // 멤버변수(필드)는 staitc 이 붙은것과 아닌것에 따라 구분될 수 있다.

    // 멤버변수(필드)의 종류
    // 1. 인스턴스 변수  : static 이 붙지 않은 멤버 변수 , 예) name
    // -  static 이 붙지 않은 멤버 변수는 인스턴스를 생성해야 사용할 수 있고, 인스턴스에 소속되어 있다.
    // 따라서 인스턴스 변수라고 한다.

    // 2. 클래스 변수 : static 이 붙은 멤버 변수 , 예) count
    // - 클래스 변수 , 정적변수 , static 변수등으로 부른다. 용어를 모두 사용하니 주의
    // - static 이 붙은 멤버변수는 인스턴스와 무관하게 클래스에 바로 접근해서 사용 할 수 있고, 클래스 자체에 소속되어
    // 있다. 따라서 클래스 변수라 한다.
    // - 클래스 변수는 자바 프로그램을 시작할 때 딱 1개가 만들어진다. 인스턴스와는 다르게 보통 여러곳에서 공유하는 목적으로 사용된다.
    public Data3 (String name){
        this.name = name;
        count++; // 내 코드 안에서는 Data3.count 라고 안해도 된다. Data3 생략 가능
    }
}
