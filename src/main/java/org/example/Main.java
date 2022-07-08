package org.example;

import java.util.Scanner;

class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус окружности в сантиметрах: ");
        int radius = scanner.nextInt();
        double Area = MathMethods.calculateCircleArea(radius);
        double Lenght = MathMethods.calculateCircleLenght(radius);
        System.out.println("Площадь круга: " + Area + " см.кв.");
        System.out.println("Длина окружности: " + Lenght + " см.");
    }


}