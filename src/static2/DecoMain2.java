package static2;

public class DecoMain2 {

    public static void main(String[] args) {
        String s = "hello java";
        String result = DecoUtil2.deco(s); // 객체를 생성없이 바로 부를수 있다. 클래스로 바로 찾아감

        System.out.println("before: " + s);
        System.out.println("after: " + result);
    }
}
