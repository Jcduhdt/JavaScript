import java.util.Arrays;
import java.util.Comparator;

/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2019-07-28
 */

/*
 * Lambda表达式有参数返回值练习
 * 需求：
 *  使用数组存储多个Person对象
 *  对数组中的Person对象使用Arrays的sort方法通过年龄进行升序排序
 */
public class LambdaDemo4 {
    public static void main(String[] args) {
        //使用数组存储多个Person对象
        Person[] arr = {
                new Person("柳岩",38),
                new Person("迪丽热巴",18),
                new Person("古力娜扎",19)
        };

        //对数组中的Person对象使用Arrays的sort方法通过年龄进行升序（前边-后边）排序
        /*Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });
*/
        //使用Lambda表达式，简化匿名内部类
        Arrays.sort(arr,(Person o1,Person o2)->{
            return o1.getAge()-o2.getAge();
        });

        //遍历数组
        for (Person person : arr) {
            System.out.println(person);
        }
    }
}
