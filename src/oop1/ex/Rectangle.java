package oop1.ex;

public class Rectangle {
        int width = 5;
        int height = 8;

    void calculateArea(int width, int height) {
        int area = width * height;
        System.out.println("넓이: " + area);
    }

    void calculatePerimeter(int width, int height) {
        int perimeter = 2 * (width + height);
        System.out.println("둘레 길이: " + perimeter);
    }

    void isSquare(int width, int height) {
        boolean square = width == height;
        System.out.println("정사각형 여부: " + square);
    }


}
