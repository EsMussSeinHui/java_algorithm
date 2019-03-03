package Third;

import java.util.Scanner;

/**
 * @Author: hui
 * @Date: 2019/3/3 18:35
 * 跟奥巴马一起编程 图形输出
 */
public class PatB1036 {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        char c=scanner.next().charAt(0);
        for(int i=0;i<n-1;i++)
                System.out.print(c);
        System.out.println(c);
        for(int i=0;i<(n/2-2);i++){
            System.out.print(c);
            for (int j=0;j<n-2;j++)
                System.out.print(" ");
            System.out.println(c);
        }
        for(int i=0;i<n-1;i++)
            System.out.print(c);
        System.out.println(c);
    }
}
