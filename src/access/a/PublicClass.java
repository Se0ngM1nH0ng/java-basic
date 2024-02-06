package access.a;

public class PublicClass { // 파일명과 public 클래스 명이 같아야 한다. 하나의 java 파일에는 public 이 하나만 적용 된다.
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 defaultClass1 = new DefaultClass1();
        DefaultClass2 defaultClass2 = new DefaultClass2();
    }


}
class DefaultClass1 {

}

class DefaultClass2 {

}