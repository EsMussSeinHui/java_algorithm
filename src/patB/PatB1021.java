package patB;

import java.util.Scanner;

/**
 * @Author: hui
 * @Date: 2019/3/14 21:19
 */
public class PatB1021 {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        int [] count=new int [10];
        for (int i=0;i<str.length();i++)
        {
            count[str.charAt(i)-48]++;
        }
        int num=0;
        int index=0;
        for (int i=0;i<10;i++)
        {
            if(count[i]!=0)
            {
                num++;
                index=i;
            }
        }
        for (int i=0;i<index;i++)
        {
            if(count[i]!=0)
               System.out.println(i+":"+count[i]);
        }
        System.out.print(index+":"+count[index]);

    }
}
