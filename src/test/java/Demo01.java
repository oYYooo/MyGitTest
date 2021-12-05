import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * Created by Zhou
 * Date:2021/10/19
 * Time:20:55
 */
public class Demo01 {

    @Test // 无参数无返回值
    public void test01() {
        Runnable r1 = () -> {
            System.out.println("hello wold");
        };
        r1.run();
    }

    @Test  // 有一个参数 无返回值
    public void test02() {
        Consumer c = (x) -> System.out.println(x);
        c.accept("I am Lambda");
        // 输出  I am Lambda
    }

    @Test //多个参数 有返回值
    public void test03() {
       Comparator<Integer> com = (a,b)->{
           System.out.println("函数式接口");
           return Integer.compare(a,b);
       };
       com.compare(8,9);
    }
}
