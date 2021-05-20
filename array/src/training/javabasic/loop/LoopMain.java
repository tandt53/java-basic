package training.javabasic.loop;

public class LoopMain {

    public static void main(String[] args) {

//        forloop();
//        whileLoop();
        doWhileLoop();

        // index trong mang
//        String[] array = new String[4];
//        for (String s : array) { // khong quan tam den index
//            System.out.println(s);
//        }
//
//        for (int i = 0; i < array.length; i++) { // can quan tam den index
//            System.out.println(array[i]);
//        }

        // while:  can quan tam den index
        // doWhile: can quan tam den index


//         boolean expression ~ result = true / false
//        if(i< 10)

    }

    static void forloop() {
        // syntax:
        // for( <initial_state> ; <boolean_expression> ; <increment> ) {
        //  body
        // }

        // cach 1

        for (int i = 0; i < 10; i++) {
            System.out.println(i + "");
        }

        int i;
        for (i = 0; i < 10; i++) {
            System.out.println(i + "");
        }

        // cach 2
        /*int i = 0;
        for( ; i < 10; i++){
            System.out.println(i + "");
        }*/

        // cach 3
        /*int i = 0;
        for (; i < 10; ) {          // ~ while(i<10){}
            System.out.println(i + "");
            i++;
        }*/

        // cach 4
        /*int i = 0;
        for (; ; ) {           // boolean_expression always true ~ while(true){}
            System.out.println(i + "");
            i++;
            if (i == 10)
                break;
        }*/


//        int i = 10;
        /*for (int i = 10; i < 10; i++) {
            System.out.println(i + "");
        }*/


    }

    static void whileLoop() {

        // cach 1
        /*int i = 0;
        while (i < 10) {
            System.out.println(i + "");
            i++;
        }*/

        // cach 2
//        int i = 0;
//        while (true) {
//            System.out.println(i + "");
//            i++;
//            if (i == 10)
//                break;
//        }

        int i = 10;
        while (i < 10) {
            System.out.println(i + "");
            i++;
        }
    }

    static void doWhileLoop() {

        // cach 1
        /*int i = 0;
        do {
            System.out.println(i + "");
            i++;
        } while (i < 10);*/

        // cach 2
        /*int i = 0;
        do {
            System.out.println(i + "");
            i++;
            if (i == 10)
                break;
        } while (true);*/

        int i = 10;
        do {
            System.out.println(i + "");
            i++;
        } while (i < 10);
    }
}
