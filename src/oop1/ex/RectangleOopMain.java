package oop1.ex;

public class RectangleOopMain {
        public static void main(String[] args) {
            // 방법 1
            Rectangle rectangle = new Rectangle();
            rectangle.calculateArea(rectangle.width, rectangle.height);
            rectangle.calculatePerimeter(rectangle.width, rectangle.height);
            rectangle.isSquare(rectangle.width, rectangle.height);
        }
}
