package training.javabasic.staticdemo;

import static training.javabasic.staticdemo.StaticMain.method2;

public class UsingStaticMain {

    public static void main(String[] args) {
        int variable = StaticMain.DEFAULT_STATIC_VALUE;
        StaticMain.method2();
//        StaticMain.method1();

        StaticMain staticMain = new StaticMain();
        staticMain.method1();
        staticMain.method2();

        // import static
        method2();
    }
}
