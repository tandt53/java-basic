package training.javabasic.array;

public class UsingArray {
//    param01 param02 param03
    public static void main(String[] args) {
        // khai báo mảng: <kiểu dữ liệu> [] <tên của mảng> ;
        // Khởi tạo mảng: <tên của mảng> = new <kiểu dữ liệu> [ < độ dài của mảng > ];
        int[] intArray; // khai báo 1 mảng có tên intArray, mảng này gồm các phần tử có kiểu dữ liệu là int
        intArray = new int[3]; // khởi tạo các giá trị cho các phần tử trong mảng/ khởi tạo mảng

        // khai báo và khởi tạo mảng ở 1 dòng
        int[] intArray2 = new int[3];

        // Khởi tạo mảng: <kiểu dữ liệu> <tên của mảng> [];
        int intArray3[];
        intArray3 = new int[3]; // khởi tạo các giá trị cho các phần tử trong mảng/ khởi tạo mảng


        int[] intArray4; // dấu ngoặc vuông đặt trước tên biến,
        // thì toàn bộ biến ở phía sau sẽ được khai báo là kiểu mảng
        int intArray6[], intArray7;  // nếu dấu ngoặc vuông đặc ngay sau tên biến, thì chỉ biến đó là kiểu mảng
        // intArray6 là mảng
        // intArray7 là biến kiểu int (ko phải mảng)


        // khởi tạo
        intArray4 = new int[4];

        int[] intArray5 = {2, 4, 3, 5, 6};
        // dùng index để truy cập vào các phần tử trong mảng

        // lấy giá trị các phần tử trong mảng ra
        for(int index = 0; index < intArray5.length; index ++){
            System.out.println(intArray5[index]);
        }



//        int intArray2[] = new int[3];
//
//        intArray[0] = 3;
//        intArray[1] = 4;
//        intArray[2] = 6;
//
//        int sum = sum(intArray);
//        float average = average(intArray);
//
//        System.out.println("Sum = " + sum);
//        System.out.println("Average = " + average);
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

