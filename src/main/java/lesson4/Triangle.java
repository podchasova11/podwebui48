package lesson4;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите катет треугольника: ");
        int a = in.nextInt();
        System.out.println("Введите катет треугольника: ");
        int b = in.nextInt();
        System.out.println("Введите гипотенузу треугольника: ");
        int c = in.nextInt();
        System.out.println("Введите высоту треугольника: ");
        int h = in.nextInt();
        int p = a+b+c;
        int s = (a*h)/2;
        System.out.println("Периметр треугольника равна: " + p);
        System.out.println("Площадь треугольника равна: " + s);
    }
}
