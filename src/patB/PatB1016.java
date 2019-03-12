package patB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 * @Author: hui
 * @Date: 2019/3/6 12:54
 */
public class PatB1016 {
    public static void main(String [] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String [] str=reader.readLine().split(" ");
        double num1=0,num2=0;
        char c1=str[1].charAt(0);
        char c2=str[3].charAt(0);
        int count=0;
        for(int i=0;i<str[0].length();i++)
        {
            if(str[0].charAt(i)==c1)
            {
                num1+=Math.pow(10,count)*Integer.parseInt(str[1]);
                count++;
            }
        }
        count=0;
        for(int i=0;i<str[2].length();i++)
        {
            if(str[2].charAt(i)==c2)
            {
                num2+=Math.pow(10,count)*Integer.parseInt(str[3]);
                count++;
            }
        }
        int i=(int)(num1+num2);
        System.out.print(i);
    }
}
