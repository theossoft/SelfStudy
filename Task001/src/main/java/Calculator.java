import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Menu();
    }

    public static List<Integer> Menu() {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Это калькулятор");
        System.out.println("Для умножения нажми 1");
        System.out.println("Для деления нажми 2");
        System.out.println("Для сложения нажми 3");
        System.out.println("Для вычитания нажми 4");
        System.out.print("Выбери пункт меню: ");
        list.add(scanner.nextInt());
        System.out.println("Введи два числа для вычисления");
        System.out.println("Введи первое число: ");
        list.add(scanner.nextInt());
        System.out.println("Введи второе число: ");
        list.add(scanner.nextInt());
        return list;
    }

    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void minus(int first, int second) {
        int result = first - second;
        System.out.println(result);
    }

    public static void multiply(int first, int second) {
        int result = first * second;
        System.out.println(result);
    }

    public static void divider(int first, int second) {
        double result = (double) first / second;
        System.out.println(result);
    }
}
