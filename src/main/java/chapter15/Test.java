package chapter15;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Created by simjunbo on 2018-04-25.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(String.format("p1 : %s, p2 : %.2f", "one", 1.234f));


        // Unmodifiable
        // create set
        Set<String> set = new HashSet<String>();
        // populate the set
        set.add("Welcome");
        set.add("to");
        set.add("TP");
        System.out.println("Initial set value: " + set);
        // create unmodifiable set
        Set unmodset = Collections.unmodifiableSet(set);
        // try to modify the set
        unmodset.add("Hello");

        // 커링
        Stream.of(1,3,6,7)
                .map(multipltyCurry(2))
                .forEach(System.out::println);
    }

    static Function<Integer, Integer> multipltyCurry(int x) {
        return (Integer y) -> x * y;
    }
}
