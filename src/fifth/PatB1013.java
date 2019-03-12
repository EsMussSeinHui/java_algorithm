package fifth;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: hui
 * @Date: 2019/3/7 12:53
 */
public class PatB1013 {
    static  boolean [] bool=new boolean[10001000];
    static  List<Integer> list=new LinkedList<>();
    public static  void main(String [] agrs)
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        prime();
        int count=0;
        for(int i=n-1;i<m-1;i++){
              count++;
               System.out.print(list.get(i));
            if(count!=10)
                System.out.print(" ");
            else{
                count=0;
                System.out.println();
            }
        }
        System.out.print(list.get(m-1));
    }
    public static void prime()
    {
        for(int i=2;i<1001000;i++){
            if(bool[i]==false)
            {
                list.add(i);
                for(int j=i+i;j<1001000;j+=i){
                    bool[j]=true;
                }
            }
        }
    }
}
