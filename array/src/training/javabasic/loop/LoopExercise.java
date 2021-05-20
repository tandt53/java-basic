package training.javabasic.loop;

import java.util.Scanner;

public class LoopExercise {

    // Liệt kê n số fibonacci đầu tiên.
    public static void main(String[] args) {
//        Scanner
        int n = 5; // nhập từ console

        fibonacci(n);

    }

    static void fibonacci(int n) {
        /**
         * Dãy Fibonacci là dãy vô hạn các số tự nhiên bắt đầu bằng 1 và 1,
         * sau đó các số tiếp theo sẽ bằng tổng của 2 số liền trước nó.
         *
         * Cụ thể, các số đầu tiên của dãy Fibonacci là:
         * 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610...
         */

        // Gia su n = 3
        // n = 3: 1, 1, 2
        // n = 4: 1, 1, 2, 3
        // n = 5: 1, 1, 2, 3, 5

        // dãy này cố định luôn có 2 ký tự đầu tiên là 1 và 1
        // nếu nhập n = 1 -> in ra 1
        // nếu nhập n = 2 -> in ra 1, 1
        // nếu nhập n = 3 -> chắc chắn in ra 1, 1.
        //                   số lượng ký tự cần in ra thêm là: 3 - 2 = 1
        //                   ký tự tiếp theo cần được in ra là: 1 + 1 = 2
        // nếu nhập n = 4 -> chắc chắn in ra 1, 1.
        //                   số lượng ký tự cần in ra thêm là: 4 - 2 = 2
        //                  ký tự tiếp theo cần được in là: (1 + 1 = 2) và (1 + 2 = 3)
        // nếu nhập n = 5 -> chắc chắn in ra 1, 1.
        //                   số lượng ký tự cần in ra thêm là: 5 - 2 = 3
        //                  ký tự tiếp theo cần được in là: (1 + 1 = 2), (1 + 2 = 3), (2 + 3 = 5)
        // nếu nhập n = 6 -> chắc chắn in ra 1, 1.
        //                   số lượng ký tự cần in ra thêm là: 6 - 2 = 4
        //                  ký tự tiếp theo cần được in là: (1 + 1 = 2), (1 + 2 = 3), (2 + 3 = 5), (3 + 5 = 8)

        // nhận xét: nếu n tăng từ 3, thì số lượng ký tự cần in ra thêm cũng sẽ tăng dần từ 1. => có thể dùng loop (for, while, doWhile)
        //

//        int n = 1;
//        if (n == 1) {
////            in ra 1
//        } else if (n == 2) {
////            in ra 1, 1
//        } else if (n == 3) {
//            // in ra 1, 1
//            // loop để in ra các ký tự tiếp theo
//            for (int i = 0; i < 1;++) {
//                // gias trij can in ra = 1 + 1
//            }
//        } else if (n == 4) {
//            // in ra 1, 1
//            // loop để in ra các ký tự tiếp theo
//            for (int i = 0; i < 2; i++) {
//                // gias trij can in ra:
//                // i = 0: 1 + 1
//                // i = 1: 1 + gia tri in ra truoc do
//            }
//        } else if (n == 5) {
//            // in ra 1, 1
//            // loop để in ra các ký tự tiếp theo
//            for (int i = 0; i < 3; i++) {
//                // gias trij can in ra:
//                // i = 0: 1 + 1
//                // i = 1: 1 + gia tri in ra truoc do (i=0)
//                // i = 2: gia tri in ra truoc do (i=0) + gia tri in ra truoc do (i=1)
//            }
//        }

//        Số sau = tổng 2 số liền trước nó
//        + cần 2 biến để lưu 2 số liền trước nó: b1, b2
//        b1 = 1 và b2 = 1
//        giá trị cần in là b = b1 + b2

        int b1 = 0;
        int b2 = 1;


        // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610...
        for (int i = 1; i <= n; i++) {
            // i == 1, in ra 1
            if (i == 1) {
                System.out.println(1 + "");
            }
            // i == 2, in ra 1, 1
            else if (i == 2) {
                System.out.println(1 + ", " + 1);
            } else {
                // i >= 3
                int b = b1 + b2; // là số cần in ra màn hình
                b1 = b2; // luu gia tri lien ke b
                b2 = b; // luu gia tri để tính cho vòng lặp tiếp theo
                System.out.println(b + "");
            }
        }
    }
}
