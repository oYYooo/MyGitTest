package ShengFen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Zhou
 * Date:2021/11/30
 * Time:21:17
 */
public class Demo05 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Integer> collect = numbers.stream().map(e -> e * e).collect(Collectors.toList());
        System.out.println(collect);

    }
}
