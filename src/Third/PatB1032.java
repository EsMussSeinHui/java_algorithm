package Third;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 * @Author: hui
 * @Date: 2019/3/3 15:24
 * 挖掘机技术哪家强 基础
 */
public class PatB1032 {
    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(read.readLine());
        int[] school = new int[10000];
        for (int j = i; j > 0; j--) {
            String[] strings = (read.readLine().split(" "));
            school[Integer.parseInt(strings[0])] += Integer.parseInt(strings[1]);
        }
        int k = 1, max = -1;
        for (int j = 1; j <= i; j++) {
            if (school[j] > max) {
                max = school[j];
                k = j;
            }
        }
        System.out.printf("%d %d\n", k, max);
    }
}

//前面的问题 还是注重in ，deal 还是比较简单，scanner 和 BufferRead 基础编程的熟练程度
