package string.loggerratelimiter;

import java.util.HashMap;

public class Logger {

    private HashMap<String, Integer> map= new HashMap<>();
    public Logger() {

    }

    public boolean shouldPrintMessage(int timestamp, String message) {
        if (map.containsKey(message))
        {
            if (map.get(message)>timestamp)
                return false;
        }
            map.put(message,timestamp+10);

            return true;
    }

    public static void main(String[] args) {
        Logger logger = new Logger();
//        System.out.println( logger.shouldPrintMessage(1, "foo"));
//
//        System.out.println(logger.shouldPrintMessage(2, "bar"));
//        System.out.println(logger.shouldPrintMessage(3, "foo"));
        //System.out.println( logger.shouldPrintMessage());
        System.out.println( logger.shouldPrintMessage(0,"A1"));
        System.out.println( logger.shouldPrintMessage(3,"A4"));
        System.out.println( logger.shouldPrintMessage(6,"A0"));
        System.out.println( logger.shouldPrintMessage(9,"A3"));
        System.out.println( logger.shouldPrintMessage(12,"A3"));
        System.out.println( logger.shouldPrintMessage(15,"A4"));
        System.out.println( logger.shouldPrintMessage(18,"A3"));
        System.out.println( logger.shouldPrintMessage(21,"A2"));
        System.out.println( logger.shouldPrintMessage(24,"A1"));
        System.out.println( logger.shouldPrintMessage(27,"A2"));
        System.out.println( logger.shouldPrintMessage(30,"A0"));
        System.out.println( logger.shouldPrintMessage(33,"A0"));
    }
}
