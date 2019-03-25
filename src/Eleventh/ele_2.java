package Eleventh;

import java.util.Scanner;

/**
 * @Author: hui
 * @Date: 2019/3/14 19:30
 * 最大连续子序列和  暴力不可取 最优子结构 dp[i]=max(f[i],dp[i-1]+f[i])   还要去遍历寻找
 * 给定一个数字序列a1……an， 求i，j[1,n]， 使 ai……aj 最大
 * 无后效性 ，当前状态记录了历史信息，一旦当前状态确定没就不会在改变，且未来的决策只能在已有的一个或者若干个状态的基础上进行
 * 历史信息只能通过已有的状态去影响未来的决策
 */

/*
input -2 11 -4 13 -5 -2
out  20
 */
public class ele_2 {
    public static void main(String [] args)
    {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String [] strings=str.split(" ");
        int [] f=new int [strings.length]  ;
        int [] dp=new int [strings.length]  ;
        for(int i=0;i<strings.length;i++)
        {
            f[i]=Integer.parseInt(strings[i]);
        }
        dp[0]=f[0];
        for(int i=1;i<strings.length;i++)
        {
            dp[i]=Math.max(f[i],dp[i-1]+f[i]);
        }
        int max=dp[0];
        for (int i:dp
             ) {
            if (i>max)
                max=i;
        }
        System.out.println(max);
    }
}
