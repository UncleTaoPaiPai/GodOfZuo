/**
 * @Auther : YongggzHi
 * @Date : 2022/8/10 - 19:35
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */
public class Code_01 {

    //二进制打印一个数字（32位）
    public static void print(int num) {
        for (int i =31;i>=0;i--) {

            /**
             *      i<<2 表示移位
             *      “1” 向左边移动 2格
             *
             *      & 与·运算：   只有两个是 “1” 的情况下，才能输出的结果才能为 “1”
             *      “num”，本身在计算机的底层就已经是一个二进制的数字，
             *      例如：10：
             *      0000 0000 0000 0000 0000 0000 0000 1010
             *      循环开始：
             *      i=31   （i<<31）
             *      1000 0000 0000 0000 0000 0000 0000 0000
             *       ...
             *       ...
             *      一直到 i=4的时候：
             *      0000 0000 0000 0000 0000 0000 0000 1000
             *      此时输出就为 “1”，然后其他位用零代替
             *
             * */

            System.out.print((num & (1<<i)) == 0?"0":"1");
        }
        System.out.println();


    }

    public static void main(String[] args) {
        int num = Integer.MIN_VALUE;
        print(num);
       
    }
}
