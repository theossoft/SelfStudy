package calculateApp.service;

import java.util.Scanner;

public class Processor {

    private final static CalculateService service = new CalculateServiceStandard();


    public static double getStandardResult() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if(i == 5) {
            System.exit(0);
        }
        System.out.println("Введите первое число:");
        double first = scanner.nextDouble();
        System.out.println("Введите второе число:");
        double second = scanner.nextDouble();
        return switch (i) {
            case 1 -> service.sum(first, second);
            case 2 -> service.minus(first, second);
            case 3 -> service.multiply(first, second);
            case 4 -> service.division(first, second);
            default -> throw new IllegalStateException("Параметра " + i + " не существует!");
        };
    }
}