/*
    编程计算用户输入的年月日是这一年的第几天。
    作者：陈杨
*/
import java.util.Scanner;   

public class DayCal {

    public static void main(String[] args) {

        // 第一步：提醒用户输入年月日并且用相应参数记录
        System.out.println("用户请输入年月日，用空格隔开!月在1-12之间，日在1-31之间!");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        // 第二步：根据年份判断是否是闰年
        boolean leapyear = false;
        // 只有两种情况下，年份会是闰年（1）整除400 （2）整除4但不能整除100
        if (0 == year % 400) leapyear = true;

        if (0 == year % 4 && 0 != year % 100) leapyear = true;
        // 第三步：根据第二步的结果来计算天数
        // 我们用一个int 数组来存储月份天数累加的结果
        int[] accday = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
        // 如果是闰年就是2月以后的天数相应加一
        int[] accleapday = new int[12];
        accleapday[0] = accday[0];
        accleapday[1] = accday[1];
        for (int i = 2; i < accday.length; i++) {
            accleapday[i] = accday[i] + 1;
        }
        // 由此我们可以根据月日来计算天数
        int days = 0;
        if (leapyear) {
            days = accleapday[month-1] + day;
        } else {
            days = accday[month-1] + day;
        }

        // 第四步：输出相应的结果
        System.out.println(year + "年" + month + "月" + day + "日是这一年的第" + days + "天");
    }
}
        
