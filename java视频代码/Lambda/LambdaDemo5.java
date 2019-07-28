import java.util.ArrayList;

/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2019-07-28
 */

/*
 * Lambda表达式：是可推导，可省略的
 * 凡是根据上下文推导出来的内容，都可以省略书写
 * 可以省略的内容：
 *      1.(参数列表):括号中的参数列表的数据类型，可以省略不写
 *      2.(参数列表):括号中的参数如果只有一个，那么类型和()都可以省略
 *      3.{一些代码}:如果{}中的代码只有一行，无论是否有返回值，都可以省略({},return,分号)
 *          注意：要省略{},return,分号必须一起省略
 */
public class LambdaDemo5 {
    public static void main(String[] args) {
        //JDK1.7版本前，创建集合对象必须把前后的泛型都写上
        ArrayList<String> list01 = new ArrayList<String>();

        //JDK1.7版本后，=后边的泛型可省略，后边泛型可以根据前边的泛型推导出来
        ArrayList<String> list02 = new ArrayList<>();
    }
}
