package day07.demo02;

import java.util.Random;
import java.util.Scanner;

public class Demo04RandonGame {
    public static void main(String[] args) {

        Random r = new Random();  //随机数
        int b = r.nextInt(100) + 1;  //接收随机数  [1-100]


        Scanner sc = new Scanner(System.in); //创建一个键盘


        while (true) {
            System.out.println("请输入你猜测的数字");

            int a = sc.nextInt();  //从键盘输入猜测的数字


            if (a < b) {
                System.out.println("输入的数字太小了,请重试");
            } else if (a > b) {
                System.out.println("输入的数字太大了,请重试");
            } else {
                System.out.println("恭喜你猜对了");
                break;
            }



        }
        System.out.println("游戏结束");
    }

}