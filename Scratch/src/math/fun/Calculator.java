package math.fun;

import static math.fun.*;



class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(int a, int b) {
        return a - b;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static int randomInt() {
        return randomInt(5, 20);
    }

    public static int randomInt(int min, int max) {
        double rand = Math.random();
        double scaled = rand * (max + min - 1);
        double raised = scaled + min;
        return (int) raised;
    }
}