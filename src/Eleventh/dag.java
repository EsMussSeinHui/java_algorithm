package Eleventh;

/**
 * @Author: hui
 * @Date: 2019/3/20 15:36
 * dag 最长路线
 */
public class dag {
    int[] dp = new int[10000];
    int n = 10000;
    int[] choice = new int[10000];

    int[][] G = new int[1000][1000];

    int dp(int i) {
        if (dp[i] != Integer.MAX_VALUE) return dp[i];
        for (int j = 0; j < n; j++) {
            if (G[i][j] != Integer.MAX_VALUE) {
                int temp = dp(j) + G[i][j];
                if (temp > dp[i]) {
                    dp[i] = temp;
                    choice[i] = j;
                }
            }
        }
        return dp[i];
    }

    //寻找某个节点开始的最长边
    void printPath(int i) {
        while (choice[i] != -1) { //choice 应该初始化为-1 表示不可抵达
            i=choice[i];
            System.out.printf("%d",i);
        }

    }

}