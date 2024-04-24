package extends1.ex;

public class Item { // final 이 클래스에 붙으면 상속을 못한다.

    private String name;
    private int price;

    public Item(String name, int price){
        this.name = name;
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    // 이름: JAVA 가격: 10000
    public void print(){ // 메서드에 final 을 붙이면 오버라이딩 (메서드를 변경 x)
        System.out.println("이름:" + name +", 가격:" + price);
    }
}
