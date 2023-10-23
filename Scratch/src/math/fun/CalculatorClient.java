package math.fun;

class CalculatorClient {

    public static void main(String[] args) {
        double sum = Calculator.add(3.1, 5.1);
        System.out.println("Sum is " + sum);

        System.out.println("The difference is " + Calculator.subtract(3, 5));

        System.out.println("10 is even? " + Calculator.isEven(10));
        System.out.println();

        int min = 5;
        int max = 20;
        boolean itWorks = true;

        // iterate 1_000_000
        for (int i = 0; i < 100_000_000; i++) {
            int result = Calculator.randomInt(min, max);

            if (result < min || result > max) {
                System.out.println("You have a Bug");
                System.out.println("Value returned is: " + result);
                break;
            }
        }
        System.out.println("No Bugs!");
    }

}