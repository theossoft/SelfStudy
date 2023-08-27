package calculateApp.service;

import calculateApp.view.View;

public class Application {
    public static boolean isExit = false;

    public static void start(){

        while (!isExit) {
            View.menu();

            double result = Processor.getStandardResult();
            View.print(result);
        }
    }
}
