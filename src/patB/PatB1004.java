package patB;
//提交时要把 package 删掉，不然是 答案错误
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: hui
 * @Date: 2019/3/5 17:57
 */
public class PatB1004 {
    public static void main(String []args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String hignName=null,hignNum=null;
        String lowName=null,lowNum=null;
        int hign=-1;
        int low=101;
        int score=0;
        int n=Integer.parseInt(reader.readLine());
        for(int i=0;i<n;i++){
            String [] str =reader.readLine().split(" ");
            score=Integer.parseInt(str[2]);
            if(score>hign)
            {
                hign=score;
                hignName=str[0];
                hignNum=str[1];
            }
            if(score<low)
            {
                low=score;
                lowName=str[0];
                lowNum=str[1];
            }
        }
        System.out.println(hignName+" "+hignNum);
        System.out.print(lowName+" "+lowNum);
    }
}
