package patB;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: hui
 * @Date: 2019/3/14 22:34
 */
public class PatB1023 {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        int []f=new int [10];
        for (int i=0;i<10;i++)
            f[i]=scan.nextInt();

        int index=0;
        for(int i=1;i<10;i++)
        {
            if(f[i]!=0)
            {
                index=i;
                System.out.print(i);
                f[i]--;
                break;
            }
        }

        for(int i=0;i<10;i++)
        {
           if(f[i]!=0)
           {
               for(int j=0;j<f[i];j++)
                       System.out.print(i);
           }
        }

    }
}
