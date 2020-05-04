/* 
    编程实现五子棋盘
    作者：陈杨
*/

public class QiPan {

    public static void main(String[] args) {

        // 使用char的二维数组来实现五子棋盘
        // 首先，存储相应的数据
        char[][] qipan = new char[17][17];
        for (int i = 0; i < qipan.length; i++) {
            if (0 == i) {
                qipan[i] = new char[] {' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'}; 
            } else {
                for (int j = 0; j < qipan[i].length; j++) {
                    if (0 == j) {
                        qipan[i][j] = qipan[0][i];
                    } else {
                        qipan[i][j] = '+';
                    }
                }
            }
        }

        // 打印棋盘
        for (int i = 0; i < qipan.length; i++) {
            for (int j = 0; j < qipan[i].length; j++) {
                System.out.print(qipan[i][j] + " ");
            }
            System.out.println();
        }
    }
}
