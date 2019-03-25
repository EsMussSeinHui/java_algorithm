package tenth;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Author: hui
 * @Date: 2019/3/18 19:23
 */
public class bfs {
    static boolean []inq=new boolean[8];
    static int [][]G=new int [8][8];
    static void BFS(int u){
        Queue<Integer> queue=new PriorityQueue<>();
        queue.add(u);
        inq[u]=true;
        while(!queue.isEmpty()){
            int x= queue.peek();
            for (int i=0;i<8;i++)
            {
                if(G[u][i]!=Integer.MAX_VALUE&&inq[i]==false)
                {
                    queue.add(i);
                    inq[i]=true;
                }
            }
        }
    }

    static void BFSTrave(){
        for(int u=0;u<8;u++){
            if(inq[u]==false){
                BFS(u);
            }
        }
    }



}
