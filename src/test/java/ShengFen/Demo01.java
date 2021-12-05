package ShengFen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Zhou
 * Date:2021/11/27
 * Time:18:39
 */
public class Demo01 {


    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Collections.addAll(list, "河北省", "山西省", "吉林省", "辽宁省",
                "黑龙江省", "陕西省", "甘肃省", "青海省", "山东省",
                "福建省", "浙江省", "台湾省", "河南省", "湖北省",
                "湖南省", "江西省", "江苏省", "安徽省", "广东省",
                "海南省", "四川省", "贵州省", "云南省", "北京市",
                "天津市", "上海市", "重庆市", "内蒙古自治区",
                "新疆维吾尔自治区", "宁夏回族自治区", "广西壮族自治区",
                "西藏自治区", "香港特别行政区", "澳门特别行政区");


/**
 * 题目17：统计三个字的省份的个数
 * 题目18：统计名字中包含方位名词的省份（东西南北）的省份
 * 题目19：打印名字中包含方位名词的普通省份（非自治区直辖市特别行政区）的名字
 * 题目20：将所有的特殊省份（自治区直辖市特别行政区）提取出来并放到新数组中
 * list.stream().filter(s -> s.length() == 3).collect(Collection.toList());
 *         2.list.stream().filter(s -> s.contains("东") ||  s.contains("南") ||  s.contains("西") ||  s.contains("北")).collect(Collection.toList);
 *         3.list.stream().filter(s -> !s.contains("自治区直辖市特别行政区").collect(Collection.toList());
 *         4.list.stream().filter(s -> s.contains("自治区直辖市特别行政区").collect(Collection.toList());
 * */

//        list.stream().filter(s -> s.length() == 3).collect(Collectors.toList());
        // list.stream().filter(s -> s.length() == 3).forEach(System.out::println);
//      list.stream().filter(s->s.contains("东")).collect(Collectors.toList()).forEach(System.out::println);
//        System.out.println("-------");
//        list.stream().filter(s->s.contains("东")).forEach(System.out::println);
      //  list.stream().filter(s -> s.contains("自治区直辖市特别行政区").collect(Collection.toList()));
        list.stream().filter(s -> s.contains("自治区直辖市特别行政区")).collect(Collectors.toList());
    }

}
