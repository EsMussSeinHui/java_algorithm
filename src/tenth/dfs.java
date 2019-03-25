package tenth;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: hui
 * @Date: 2019/3/18 11:04
 */

//dfs 最基本算是递归吧
public class dfs {
    final int maxv=1000;
    boolean []vis=new boolean[maxv];
    int n;
    int [][]G=new int [maxv][maxv];
    //邻接矩阵   递归
    void dfs(int u,int depth)
    {
        vis[u]=true; //表示节点访问过
        for (int i=0;i<n;i++)
        {
            if(vis[i]==false&&G[u][i]!=Integer.MAX_VALUE)
                dfs(i,depth+1);
        }
    }

    void dfsTrave(){  //遍历图G
        for (int i=0;i<n;i++){
            if(vis[i]==false)
                dfs(i,1);
        }
    }

     List<ArrayList<Integer>> list=new LinkedList<>();

   //邻接表版本  递归
//    List<Integer> []array=new LinkedList<Integer>() [100];
    void DFS(int u ,int depth){
        vis[u]=true;
        for(int i=0;i<list.get(i).size();i++){
            int v=list.get(u).get(i);
            if(vis[v]==false){
                dfs(v,depth+1);
            }
        }
    }


}
