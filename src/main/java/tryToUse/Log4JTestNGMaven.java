package tryToUse;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

/**
 * Created by SChubuk on 20.10.2017.
 */
public class Log4JTestNGMaven {
   // private static final Logger log = Logger.getLogger(Log4J.class);
    private static final Logger log = Logger.getLogger("devpinoyLogger");

    @Test
    public static void test(){
        log.warn("START");
        Methods.method();
    }
}
