package tryToUse;

import com.jcabi.aspects.Loggable;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class log {
    @Loggable(Loggable.ERROR/*, prepend=true*/)
    public static void main2(String[] args) {
        System.out.println("Testing");
        int a = go(5,4);
        System.out.println(a);
        /*foo("string", 5);*/
    }

    @Loggable(Loggable.ERROR/*, prepend=true*/)
    public static int go(int a, int b) {
        return a+b;
    }

  /*  public static void foo(String s, int n) { // log is a log4j logger or any other library
        log.trace(String.format("Enter foo with s: %s, n: %d", s, n));
        log.trace("Exit foo");
    }*/
}
