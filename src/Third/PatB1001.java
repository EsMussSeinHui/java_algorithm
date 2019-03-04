package Third;

import java.util.Scanner;

/**
 * @Author: hui
 * @Date: 2019/3/3 13:52
 */
public class PatB1001 {
    public static void main(String[] args) {
        int step = 0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n != 1) {
            if (n % 2 == 0)
                n = n / 2;
            else
                n = (3 * n + 1) / 2;
            step++;
        }
        scan.close();
        System.out.printf("%d\n",step);
    }
}
