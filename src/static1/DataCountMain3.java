package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count=" + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count=" + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count=" + Data3.count);

        // 추가
        // 인스턴스를 통한 접근  // 추천 x
        Data3 data4 = new Data3("D");
        System.out.println(data4.count); // 인스턴스를 통해 접근했다가 static 이네 하고 객체 클래스변수로 돌아감

        // 클래스를 통한 접근
        System.out.println(Data3.count);
    }
}
