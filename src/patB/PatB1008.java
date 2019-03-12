package patB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: hui
 * @Date: 2019/3/5 20:13
 */
public class PatB1008 {
    public static void main(String [] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String [] str=reader.readLine().split(" ");
        int n=Integer.parseInt(str[0]);
        int m=Integer.parseInt(str[1]);
        String [] strings=new String[n];
        strings=reader.readLine().split(" ");

        m%=n;
        //如果没有判断0，那么string.length-1 = -1 越界
        if(m!=0) {
            reverse(strings, 0, strings.length - 1);
            reverse(strings, 0, m - 1);
            reverse(strings, m, strings.length - 1);
        }
        for(int i=0;i<strings.length-1;i++)
        {
            System.out.print(strings[i]+" ");
        }
        System.out.print(strings[strings.length-1]);
        reader.close();
    }

    public static void reverse(String [] str,int first,int last)
    {
        int j=last;
        for(int i=first;i<=(first+last)/2;i++){
            String temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            j--;
        }
    }
}
