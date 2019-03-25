package Third;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: hui
 * @Date: 2019/3/3 21:03
 * 说反话
 * 感觉用java做有点作弊的感觉
 */
public class PatB1009 {
    public static void main(String [] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String a=reader.readLine();
        String [] ans=reader.readLine().split(" ");
        for (int i=ans.length-1;i>0;i--){
            System.out.print(ans[i]);
            System.out.print(" ");
        }
        System.out.print(ans[0]);
    }
}
