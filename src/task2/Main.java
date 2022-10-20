package task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

import static java.lang.String.*;

public class Main {
    public static void main(String[] args) {

        String name = "Andrey";
        String name1 = "Vany";
        String name2 = "Dima";
        String name3 = "Pasha";

        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            if(i == 0) {
                students.add(new Student("Sasha"));
            }
            if(i > 0 && i < 3){
                students.add(new Student(name));
            }else if(i > 2 && i < 5){
                students.add(new Student(name1));
            }else if(i > 4 && i < 7){
                students.add(new Student(name2));
            }else if(i > 6){
                students.add(new Student(name3));
            }
        }

        ArrayList<String> strings = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            strings.add(students.get(i).getName());
        }

        System.out.println(strings);

        System.out.println(students);

        Stream<Student> stream = students.stream();
        Stream<Student> stream1 = students.stream();
        Stream<String> stream2 = strings.stream();

        System.out.println(stream.filter(x ->x.getName().equalsIgnoreCase("VaNy")).count());
        stream1.filter(x ->x.getName().toLowerCase().startsWith("a".toLowerCase())).distinct().forEach(System.out::println);
        //System.out.println(stream1.filter(x ->x.getName().toLowerCase().startsWith("a".toLowerCase())).count());
        System.out.println();
        System.out.println(stream2.sorted().findFirst());
    }
}
