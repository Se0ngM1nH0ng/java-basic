package oop1.ex;

public class RectangleOopMain2 {
        public static void main(String[] args) {
            // 방법 2
            Rectangle2 rectangle2 = new Rectangle2();
            rectangle2.width = 5; // 내가 값을 설정
            rectangle2.height = 8;

            int area = rectangle2.calculateArea();
            System.out.println("넓이: " + area);

            int perimeter = rectangle2.calculatePerimeter();
            System.out.println("둘레 길이: " + perimeter);

            boolean square = rectangle2.isSquare();
            System.out.println("정사각형 여부: " + square);
        }
}
