package day07.demo02;
/*
題目要求：
根据int变量num的值,来获取随机数字,范围是[1,n],可以取到1也可以取到n


思路:
1.定义一个int变量,随意赋值
2.使用Random:三个步骤,导包,创建,使用
3.在输出的随机数后加+1.例如:int result =r.nextInt(num) + 1;
4.打印随机数
 */
import java.util.Random;

public class Demo03Randon {
    public static void main(String[] args) {
        int num = 5;
        Random  r = new Random();


        for (int i = 0; i < 100; i++) {
            //本来范围为[0,n],在整体后面 + 1,结果为 [1.n]
            int result =r.nextInt(num) + 1;

            System.out.println(result);
        }

    }
}
