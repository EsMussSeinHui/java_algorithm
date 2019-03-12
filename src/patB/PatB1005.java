package patB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


/**
 * @Author: hui
 * @Date: 2019/3/5 18:31
 */
public class PatB1005 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] num = new int[n];
        int[] k = new int[1000];
        String[] str = reader.readLine().split(" ");
        for (int i = 0; i < n; i++)
            num[i] = Integer.parseInt(str[i]);

        for (int i = 0; i < n; i++) {
            int sum = num[i];
            if(k[sum]==1)
            {
                break;
            }
            while (sum != 1) {
                if (sum % 2 == 0)
                    sum /= 2;
                else
                    sum = (sum * 3 + 1) / 2;
                k[sum]++;
            }
        }
        Arrays.sort(num);//这边num 是int 数组，不是Integer数组，不能重构比较器..下次注意


        int count=0;
        for(int i=n-1;i>-1;i--)
        {
            if (k[num[i]] == 0) {
                if (count != 0)
                    System.out.print(" ");
                System.out.print(num[i]);
                count++;
            }
        }
    }
}

