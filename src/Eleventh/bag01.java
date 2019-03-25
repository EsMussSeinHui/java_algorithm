package Eleventh;

import java.util.Scanner;

/**
 * @Author: hui
 * @Date: 2019/3/19 12:59
 * 01 背包问题
 * 这边就很明显了，如果我每一步都是最优，那么结果是不是最优呢。就和 leetcode 下棋一样
 * 两人每一步都是最优，肯定是第一个人赢
 * 这边难就在于 两个变量的最优如何去判断，i是变化的，背包容量也是变化的
 * 不像是贪心一个变量去追逐最优解。
 * 逆向  01背包
 * 正向  就是可以建立在原来基础上 完全背包
 *
 * input
5 8
3 5 1 2 2
4 5 2 1 3
 *out
 10
 */
public class bag01 {
    public static void main(String [] main){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt(); //数量
        int V=scanner.nextInt(); //重量
        scanner.nextLine();
        String  []strw=scanner.nextLine().split(" ");
        int []w=new int[strw.length];
        int i=0;
        for (String s:strw)
            w[i]=Integer.parseInt(strw[i++]);
        String [] strv=scanner.nextLine().split(" ");
        int []v=new int[strw.length];
        i=0;
        for (String s:strw)
            v[i]=Integer.parseInt(strv[i++]);

        int []dp=new int[V+10];
        for (i=0;i<n;i++)
        {
            for (int x=V;x>=w[i];x--)   //x>=w[i]   >=
            {
                dp[x]=Math.max(dp[x],dp[x-w[i]]+v[i]);
                System.out.println(x+"  ");
            }
//            System.out.println(i+"  ");
        }
        int ans=0;
        for (int x: dp
             ) {
            if(ans<x)
                ans=x;
        }

        System.out.println(ans);
    }
}
