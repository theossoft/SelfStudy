package calculateApp.view;

public class View {

    public static void menu() {
        System.out.println("Выберите действие");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        System.out.println("5. Выход");
        System.out.print("Ваш выбор: ");
    }

    public static void print(double resultProcess){
        System.out.println(resultProcess + "\n");
    }


}
