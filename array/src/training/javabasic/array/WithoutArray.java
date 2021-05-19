package training.javabasic.array;

public class WithoutArray {

    public static void main(String[] args) {
        int num01 = 4;
        int num02 = 5;
        int sum = sum(num01, num02);
        float average = average(num01, num02);

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }

    // sum of 2 integer. How to calculate sum of 3 or 4 or 5, or more integers ?
    static int sum(int a, int b) {
        return a + b;
    }

    // average of 2 integer. How to calculate average of 3 or 4 or 5, or more integers ?
    static float average(int a, int b) {
        return (float) (a + b) / 2;
    }
}
