package task1;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> init = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            init.add(random.nextInt(5, 30));
        }

        for (int i : init) {
            System.out.println(i);
        }

        Stream<Integer> stream = init.stream();

        Stream<Integer> stream1 = init.stream();
        Stream<Integer> stream2 = init.stream();
        Stream<Integer> stream3 = init.stream();

        System.out.println();

        stream.distinct().
                filter(x -> x >= 7).
                filter(x -> x <= 17).
                map(x -> x * 2).
                forEach(x -> {
                    if (x % 2 == 0) {
                        System.out.println(x);
                    }
                });

        System.out.println();

        stream1.distinct().
                sorted((o1, o2) -> {
                    if (o1 > o2) {
                        return 1;
                    } else {
                        return -1;
                    }
                }).
                limit(4).
                forEach(System.out::println);

        System.out.println();

        System.out.println(stream2.count());

        System.out.println(stream3.mapToInt(x -> x).sum());
    }


}