package principle;

import groovy.console.ui.SystemOutputInterceptor;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1); // SAME ADDRESS
        System.out.println(s2); // SAME ADDRESS
    }
}
