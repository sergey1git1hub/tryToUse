package tryToUse;

import org.apache.log4j.Logger;

/**
 * Created by schubuk on 20.10.2017.
 */
public class Log4J {
    public static String level = "DEBUG";
    private static final Logger log = Logger.getLogger(Log4J.class);
    public static void main(String[] args){
        log.info("Test message");
    }

    /*public boolean le(String level1, String level2){
        return false;
    }

    public static void log(String logMessage, String _level){
        if(level.equals(_level)){
        System.out.println(logMessage);
        }
    }*/
}
