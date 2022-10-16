package common.test;

import java.util.Arrays;

public class CreatePackageAndClass {
    public static void main(String[] args) {
        String s="Longest Consecutive Sequence";
        System.out.println(String.join("", Arrays.asList(s.split("\\s+"))).toLowerCase()+".Solution");
    }
}
