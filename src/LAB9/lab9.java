package LAB9;
import java.util.*;
import java.util.stream.Collectors;
    public class lab9
    {
            public static void main(String[] args) {

                // List<String> numbers = Arrays.asList("5", "6", "7", "8", "9", "10", "11", "12", "13", "14");
                List<String> numbers = new Random().ints(10, 5, 25)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.toList());
                System.out.println(numbers);

                int sum = numbers.stream()
                        .mapToInt(Integer::parseInt)
                        .sum();

                System.out.println(sum);
            }
        }


