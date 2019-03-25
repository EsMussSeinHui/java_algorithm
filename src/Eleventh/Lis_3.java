package Eleventh;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: hui
 * @Date: 2019/3/14 20:21
 * lis 问题 最长不下降子序列
 *dp[i]=max(1,dp[j+1])
 */
/*
input
1 2 3 -9 3 9 0 11
out
6
 */
public class Lis_3 {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        String []strs=str.split(" ");
        int []f=new int [strs.length];
        for (int i=0;i<strs.length;i++){
            f[i]=Integer.parseInt(strs[i]);
        }
        int [] dp=new int [f.length];
        Arrays.fill(dp,1);
        int ans=0;
        for (int i=0;i<f.length;i++)
        {
            for (int j=0;j<i;j++)
            {
                if(f[i]>=f[j]&&dp[i]<dp[j]+1)
                    dp[i]=dp[j]+1;
            }
            ans=Math.max(ans,dp[i]);
        }
        System.out.printf("%d",ans);
    }
}
