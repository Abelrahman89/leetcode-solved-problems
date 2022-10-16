package integer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class binaryBitTest {
    public static void main(String[] args) {
//      //  https://www.interviewbit.com/java-interview-questions/#exception-propagation-java   //q71.
//        String n1=Integer.toBinaryString(8);
//        System.out.println(n1);
////        System.out.println(1000>>1);
////        System.out.println(1000>>>1);
//        System.out.println(Integer.toBinaryString(8>>1));
//        System.out.println(Integer.toBinaryString(8>>>1));
//        ////////////////////////////////////////
//        String n2=Integer.toBinaryString(-8);
//        System.out.println(n2);
//        System.out.println(-8>>1);
//        ///////////////////
//        String n3=Integer.toBinaryString(-8>>1);
//        System.out.println(n3);
//        String n4=Integer.toBinaryString(-8>>>1);
//        System.out.println(n4);
//        String s="AAAAACCCCCdAAAAACCCCCCAAAAAGGGTTT";
//        System.out.println(s.substring(0, 0 + 10));
//        System.out.println(s.substring(1, 1 + 10));
//        HashMap<Character, Integer> map = new HashMap<>();
//        System.out.println(5 * 3 + 2);

        System.out.println(LocalDateTime.now().plusDays(10));
        System.out.println(LocalDateTime.now().plusDays(10).plusHours(10));
        System.out.println(LocalDateTime.now().plusDays(10).minusHours(10));
    }
}
