package calculateApp.service;

public class CalculateServiceStandard implements CalculateService {
    @Override
    public double sum(double first, double second) {
        return first + second;
    }

    @Override
    public double minus(double first, double second) {
        return first - second;
    }

    @Override
    public double multiply(double first, double second) {
        return first * second;
    }

    @Override
    public double division(double first, double second) {
        return first / second;
    }
}
