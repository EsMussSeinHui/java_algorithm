package Eleventh;

import java.util.Scanner;

/**
 * @Author: hui
 * @Date: 2019/3/19 18:55
 * 需要预留dp[0][0]
 * 很多时候都会越界，本质上建议 所有数组都从1开始
 *
 */
public class lcs {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        String str1=scanner.nextLine();
        String str2=scanner.nextLine();
        char []ch1=str1.toCharArray();
        char []ch2=str2.toCharArray();
        int [][]dp=new int [1000][1000];
        for (int i=1;i<=ch1.length;i++)
        {
            for (int j=1;j<=ch2.length;j++){
                if(ch1[i-1]==ch2[j-1])
                    dp[i][j]=dp[i-1][j-1]+1;
                else
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        System.out.println(dp[ch1.length][ch2.length]);
    }
}
