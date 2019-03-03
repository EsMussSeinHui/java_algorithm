package Third;

import java.util.Scanner;

/**
 * @Author: hui
 * @Date: 2019/3/3 20:37
 * D进制的A+B
 * 进制转化P->Q    P->10->Q
 */
public class PatB1022 {
    public static void main(String[] args) {
        //java中封装的Q进制转10进制 ,valueOf  返回的是Integer类型， parseInt 返回的是int 基本数据类型
        //        System.out.println(Integer.valueOf("12",3).toString());
        //        Integer.parseInt("FFFF",16);
        //十进制转其他进制
        //        Integer.toHexString(10);　　//将10转换为十六进制，返回字符串类型
        //        Integer.toOctalString(10);　　//将10转为八进制，返回字符串类型
        //        Integer.toBinaryString(10);　　//将10转为二进制，返回字符串类型
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt() + scanner.nextInt();
        int d = scanner.nextInt();
        int[] ans = new int[32];
        int num = 0;
        do {
            ans[num++] = sum % d;
            sum /= d;
        } while (sum != 0);
        for (int i = num - 1; i > -1; i--)
            System.out.print(ans[i]);
    }
}
