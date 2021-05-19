package training.javabasic.array;

public class UsingArray {

    public static void main(String[] args) {
        int[] intArray = new int[3];
        int intArray2[] = new int[3];
        
        intArray[0] = 3;
        intArray[1] = 4;
        intArray[2] = 6;

        int sum = sum(intArray);
        float average = average(intArray);

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }

    static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    static float average(int[] arr) {
        float average = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return (float) sum / arr.length;
    }
}

