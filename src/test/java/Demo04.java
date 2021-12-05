import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Zhou
 * Date:2021/10/26
 * Time:21:49
 */
public class Demo04 {

    @Test
    public void test01() {
//        List<String> list = Arrays.asList("A", "B", "C", "D");
//        Stream<String> stream = list.stream();
//        stream.forEach(System.out::println);
//
//// iteartor
//        Stream.iterate(0, n -> n + 2).limit(51).forEach(System.out::println);
//// generate
//        Stream.generate(() -> "Hello Man!").limit(10).forEach(System.out::println);

        Stream.generate(() -> UUID.randomUUID().toString()).limit(10).forEach(System.out::println);

    }

    @Test
    public void test02() {

        Person person = new Person();
        List<Person> list = new ArrayList<>();
        list.add(new Person("张三", 18));
        list.add(new Person("王五", 27));
        list.add(new Person("李四", 9));
        list.add(new Person("Anne", 34));
        list.add(new Person("Joy", 27));
       // list.stream().sorted(Comparator.comparing(Person::getAge)).forEach(System.out::println);
        list.stream().sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getName)).forEach(System.out::println);
    }

    @Test
    public void test03(){
        List<Integer> list = Arrays.asList(new Integer[]{1,9,4,6,2,7,5,3});
        list.stream().sorted((n1,n2)->n1.compareTo(n2)).collect(Collectors.toList()).forEach(System.out::println);
    }

    public class Person {
        String name;
        Integer age;

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        public Person() {
        }

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }}
