package Eleventh;

import java.util.Scanner;

/**
 * @Author: hui
 * @Date: 2019/3/19 19:57
 * 最长子回文串
 * input
 * PATZJUJZTACCBCC
 */
public class stringlong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char []chars=str.toCharArray();
        int ans=1;
        int[][] dp = new int[str.length()][str.length()];
        for (int i = 0; i < str.length(); i++) {
            dp[i][i] = 1;
            if (i  < str.length()-1) {
                if(chars[i]==chars[i+1])
                {dp[i][i+1]=1;
                ans=2;
                }
            }
        }

        for (int L=3;L<=str.length();L++){
            for (int i=0;L+i-1<str.length();i++)
            {
                if(chars[i]==chars[i+L-1]&&dp[i+1][i+L-2]==1)
                {
                    dp[i][i+L-1]=1;
                    ans=L;
                }
            }
        }
        System.out.println(ans);
    }

}
