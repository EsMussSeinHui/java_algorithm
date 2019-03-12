package fifth;

import java.util.Scanner;

/**
 * @Author: hui
 * @Date: 2019/3/7 10:54
 */
public class gcd {
    public static void main(String [] agrs){
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        System.out.print(gcd(x,y));
    }

    static  int gcd(int x,int y){
        if(y==0) return x;
        return gcd(y,x%y);
    }
}
