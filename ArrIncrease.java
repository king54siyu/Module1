/*
    编程实现数组的扩容
    作者：陈杨
*/

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays; 

public class ArrIncrease {

    public static void main(String[] args) {

        // 请用户输入一个长度，作为数组初始化的长度
        System.out.println("请输入一个数字做为数组的长度：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // 借用随机数工具，后面赋值的时候用
        Random rd = new Random();
        // 初始化长度为num的数组
        int[] numbers = new int[num];

        // 使用的for循环给数组赋值
        for (int i = 0; i < num; i++) {
            numbers[i] = rd.nextInt(100) + 1;
            if (i*1.0 / num >= 0.8) {
                int num2 = (int)( num * 1.5);
                int[] temp = new int[num2];
                // 使用arraycopy
                System.arraycopy(numbers, 0, temp, 0, i);
                numbers = temp; 
                break;
            }
        }
        
        System.out.println("数组扩容前的长度是: " + num);
        System.out.println("数组扩容后的长度是: " + numbers.length);
        System.out.println("数组是: " + Arrays.toString(numbers));
    }
}
