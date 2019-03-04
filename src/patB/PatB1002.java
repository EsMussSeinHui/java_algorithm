package patB;


import java.util.Scanner;


/**
 * @Author: hui
 * @Date: 2019/3/4 18:25
 */
public class PatB1002 {
    static String [] strings={"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        int sum=0;
        int []ans=new int[3];
        for(int i=0;i<str.length();i++)
            sum+=str.charAt(i)-48;
        ans[0]=sum/100;
        ans[1]=sum%100/10;
        ans[2]=sum%10;
        if(ans[0]!=0)
        {
            System.out.print(strings[ans[0]]+" "+strings[ans[1]]+" "+strings[ans[2]]);
        }
        else if (ans[1]!=0)
        {
            System.out.print(strings[ans[1]]+" "+strings[ans[2]]);
        }
        else
            System.out.print(strings[ans[2]]);
    }
}
