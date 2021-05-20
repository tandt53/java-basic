package training.javabasic.array;

public class SortArray {

    public static void main(String[] args) {

        int[] intArray = {5, 5, 4, 4, 5};

//        sortArray(intArray);
        findMax(intArray);
    }

    static void sortArray(int[] array) {

    }


    // điều kiện array phải có ít nhất phần tử
    static void findMax(int[] array) {
        int indexMax = 0;
        int max = array[0]; // giả sử giá trị lớn nhất của mảng là phần tử đầu tiên

        int indexMax2 = 0;
        int max2 = Integer.MIN_VALUE; // giả sử giá trị lớn thứ 2 của mảng

        int tmp = -1;
        for (int i = 1; i < array.length; i++) {
            // nếu array[i] lớn hơn max
            // thì max2 = max
            // và max = array[i]
            if (array[i] > max) {
                max2 = max;
                max = array[i];
                indexMax = i;
            }

            // nếu array[i] nhỏ hơn max và lớn hơn max2
            // thì cập nhật giá trị max2
            if ( array[i] < max && array[i] > max2) {
                max2 = array[i];
                indexMax2 = i;
            }
        }

        System.out.println("Phần tử lớn nhất: " + max  + " tại vị trí index = " + indexMax);
        System.out.println("Phần tử lớn thứ 2: " + max2 + " tại vị trí index = " + indexMax2);
    }
}
