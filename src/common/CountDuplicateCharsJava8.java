package common;

import common.testingaditi.Person;

import java.util.*;
import java.util.stream.Collectors;

public class CountDuplicateCharsJava8 {


    public static void main(String[] args) {

        // given input string
        String input = "JavaJavaEE";

        // convert string into stream

        List<Person> p=new ArrayList<>();


        Map<Character, Long> result = input
                .chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        result.forEach((k, v) -> {
            if (v > 1) {
                System.out.println(k + " : " + v);
            }
        });
    }
}