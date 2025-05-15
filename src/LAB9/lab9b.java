package LAB9;

import java.util.*;
import java.util.stream.Collectors;

public class lab9b {

    public static void main(String[] args) {

        List<String> numbers = new Random().ints(10, 5, 26) // 26 pentru a include 25 (limita superioară e exclusivă)
                .mapToObj(String::valueOf)
                .collect(Collectors.toList());

        System.out.println( numbers);

        OptionalInt min = numbers.stream()
                .mapToInt(Integer::parseInt)
                .min();
        OptionalInt max = numbers.stream()
                .mapToInt(Integer::parseInt)
                .max();

        min.ifPresent(value -> System.out.println(  value));
        max.ifPresent(value -> System.out.println( value));
    }
}