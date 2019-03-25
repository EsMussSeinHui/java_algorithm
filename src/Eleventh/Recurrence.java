package Eleventh;

import java.util.Scanner;

/**
 * @Author: hui
 * @Date: 2019/3/14 19:12
 * 递推典型：树塔问题   最优子结构 dp[i][j]=max(dp[i+1][j],dp[i+1][j+1])+f[i][j]
 * 循环+自底向上
 */

/*
input
5
5
8 3
12 7 16
4 10 11 6
9 5 3 9 4

out： 44
 */
public class Recurrence {
    static int[][] f = new int[1000][1000];
    static int[][] dp = new int[1000][1000];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                f[i][j] = scan.nextInt();
            }
            scan.nextLine();
        }

        for (int i = 0; i < n; i++)
            dp[n - 1][i] = f[n - 1][i];

        for (int i=n-2;i>-1;i--)
        {
            for (int j=0;j<=i;j++)
                dp[i][j]=Math.max(dp[i+1][j],dp[i+1][j+1])+f[i][j];
        }
        scan.close();
        System.out.println(dp[0][0]);
    }
}

