package patB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: hui
 * @Date: 2019/3/6 9:18
 */
public class PatB1011 {
    public static void main(String  [] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine());
        double x=0,y=0,z=0 ;//这边有一个问题，x+y 会越界
        for(int i=1;i<=n;i++){
            String [] str=reader.readLine().split(" ");
            x=Double.parseDouble(str[0]);
            y=Double.parseDouble(str[1]);
            z=Double.parseDouble(str[2]);
            System.out.print("Case #"+i+": ");
            if(x+y>z)
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}

