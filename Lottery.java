/* 
    编程实现双色球抽奖
    作者：陈杨
*/

import java.util.Random;
import java.util.Arrays;

public class Lottery {
    
    public static void main(String[] args) {

        // 初始化一个长度为6的数组用来存储红色球号码
        int[] redballs = new int[6];
        Random rd = new Random();

        // 使用嵌套循环来产生不重复的号码1～31之间
        // 外部循环用来遍历数组
        // 内部用来检查新的随机数是否和前面的有重复
        for (int i = 0; i < redballs.length; i++) {
            redballs[i] = rd.nextInt(31) + 1; // 确保是在1～31之间
            for (int j = 0; j < i; j++) {
                if (redballs[i] == redballs[j]) {
                    i--; // 移动到前一个下标，结合i++又会回到现在这个位置，重新产生一个新的随机数
                    break; // 跳出内循环
                }
            }
        }

        // 初始化一个int整数，用于存储蓝色球的数值
        int blueball = rd.nextInt(16) + 1;

        // 答应最后的结果
        System.out.println("观众朋友们今天抽奖的最终结果是：...");
        System.out.println("红色球是: " + Arrays.toString(redballs));
        System.out.println("蓝色球是: " + blueball);
        System.out.println("恭喜获奖的朋友！！");
    }
}
