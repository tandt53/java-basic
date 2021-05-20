package training.javabasic.staticdemo;

public class StaticMain {

    public static int DEFAULT_STATIC_VALUE = 5;
    int NON_STATIC_VALUE = 6;

    // non-static method
    void method1(){
        int variable1 = DEFAULT_STATIC_VALUE;
        int variable2 = NON_STATIC_VALUE;
    }

    // static method
    static void method2(){
        int variable1 = DEFAULT_STATIC_VALUE;
//        int variable2 = NON_STATIC_VALUE;
    }

}
