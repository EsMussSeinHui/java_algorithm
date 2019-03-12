package patB;

import java.util.Scanner;

/**
 * @Author: hui
 * @Date: 2019/3/5 20:02
 */
public class PatB1006 {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        int i=scanner.nextInt();
        int b=i/100;
        int s=i%100/10;
        int last=i%10;
        for(int j=0;j<b;j++)
            System.out.print('B');
        for(int j=0;j<s;j++)
            System.out.print('S');
        for(int j=1;j<=last;j++)
            System.out.print(j);
    }
}
