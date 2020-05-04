/* 
    编程找到1000以内的所有完数
    作者：陈杨
*/

public class WanShu {

    public static void main(String[] args) {

    //使用嵌套for循环实现外层遍历1～1000的数字
    // 内层用来求某个数字的因子和
    // 最后打印满足条件的数字
    for (int i = 0; i <= 1000; i++) {
        int sum = 1;    //1必然是每一个数的因子
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (0 == i % j) {
                int num = i / j;
                sum = sum + j + num;
            }
        }
        if (i == sum) {
            System.out.println(i);
        }
    }
    }
}
//备注：结果中的1可以看作也可以不看作完全数。

