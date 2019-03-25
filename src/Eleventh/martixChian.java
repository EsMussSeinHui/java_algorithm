package Eleventh;

/**
 * @Author: hui
 * @Date: 2019/3/20 10:58
 * martixChian 矩阵连成
 * 和最长回文子串很像， 都是从底层开始
 * 所谓当前的最优 应该是建立在之前最优的基础上的最优
 * 多个变量，同样体现在01 背包问题上
 * 本质上当前的最优不是建立在之前的那个最优节点上的，否则变成贪心了
 * 所以需要多个循环去计算，但是由此可以看出子问题相同
 */
public class martixChian {


    private int array[][]=new int[4][4];;
    private int p[]=new int[]{2,4,5,5,3};
    private int s[][]=new int[4][4];;

    public void martixChain(){
        int n=10;//array.length
        for (int i=0;i<n;i++){
            array[i][i]=0;
        }
        for (int r=2;r<=n;r++){
            for (int i=0;i<=n-r;i++){
                int j=i+r-1;//r是长度，j就是右节点
                array[i][j]=array[i+1][j]+p[i]*p[i+1]*p[j+1];
                //为什么头一个节点需要特殊计算呢...
                //明明如果k=j时。。。一样，，可能只是为了做个标记，但是没备注会让人误解
                for (int k=i+1;k<j;k++)
                {
                    int t=array[i][k]+array[k+1][j]+p[i]*p[k+1]*p[j];
                    if(t<array[i][j])
                    {
                        array[i][j]=t;
                        s[i][j]=k;
                    }
                }
            }
        }
    }
}
