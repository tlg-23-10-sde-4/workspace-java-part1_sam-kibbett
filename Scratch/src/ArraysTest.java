class ArraysTest {

    public static void main(String[] args) {
        int[] ages = new int[4];
        ages[0] = 56;
        ages[1] = 50;
        ages[2] = 9;
        ages[3] = 9;

        for (int age : ages) { // for each loop
            System.out.printf("The age is: %s\n", age);
        }
        System.out.printf("This array has %s values\n", ages.length);

        System.out.println(ages);
    }

}