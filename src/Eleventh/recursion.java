package Eleventh;

/**
 * @Author: hui
 * @Date: 2019/3/14 19:03
 * 递归 recursion 写法  典型:斐波那契数列  去记录已经算过的F(n)
 * 递归式 自顶向下
 */
public class recursion {
    int[] dp = new int[1000];

    int F(int n) {
        if (n == 0 || n == 1) return 1;
        if (dp[n] != 0) return dp[n];
        else {
            dp[n]=F(n-1)+F(n-2);
            return dp[n];
        }
    }

    public static void  main(String [] args){
        recursion rec=new recursion();
        System.out.println(rec.F(6));
    }

}
