package string.compare2strings;

import java.util.Calendar;
import java.util.Date;

public class MainTest {
    public static void main(String[] args) {
        Date dt = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(dt);
        c.add(Calendar.DATE, 21);
        dt = c.getTime();
        System.out.println(dt);
    }
}
