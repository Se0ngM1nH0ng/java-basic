package oop1.ex;

public class Rectangle2 {
        int width;
        int height;

        // 본인 필드 안에 멤버변수를 쓸것이기 때문에 인자값이 필요 없다.
     int calculateArea() {
        return width * height;
    }

     int calculatePerimeter() {
        return 2 * (width + height);
    }

     boolean isSquare() {
        return width == height;
    }


}
