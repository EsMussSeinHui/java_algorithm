package patB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author: hui
 * @Date: 2019/3/6 15:38
 */

//还是超时。。 用c++写，写我的第二版本也有人过的.. 这个 公认的第三种 ..java都过不了
public class PatB1045 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] str = reader.readLine().split(" ");
        int[] num = new int[str.length];
        int[] num1=new int[str.length];
        for (int i = 0; i < str.length; i++) {
            num[i] = Integer.parseInt(str[i]);
        }

        List<Integer> list=new ArrayList<>();
        num1=Arrays.copyOf(num,num.length);
        Arrays.sort(num1);
        int mx=0;
        for (int i=0;i<str.length;i++){
            if(num[i]>mx)
            {
                mx=num[i];
                if(num[i]==num1[i])
                    list.add(num[i]);
            }
        }

       // Collections.sort(list);
        System.out.println(list.size());
        for (int i=0;i<list.size()-1;i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.print(list.get(list.size()-1));
    }
}

// 版本二 已经想到了 要比左边最大的大，右边最小的小，可还是不过.... 智穷了
//public static void main(String[] args) throws IOException {
//    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//    int n = Integer.parseInt(reader.readLine());
//    String[] str = reader.readLine().split(" ");
//    int[] num = new int[str.length];
//    for (int i = 0; i < str.length; i++) {
//        num[i] = Integer.parseInt(str[i]);
//    }
//    boolean[] bool = new boolean[str.length];
//    List<Integer> list=new ArrayList<>();
//
//    int mx=num[0];
//    for(int i=1;i<num.length;i++){
//        if(num[i]<mx)
//        {
//            bool[i]=true;
//            continue;
//        }
//        mx=num[i];
//    }
//
//    mx=num[num.length-1];
//    for(int i=num.length-2;i>-1;i--){
//        if(num[i]>mx)
//        {
//            bool[i]=true;
//            continue;
//        }
//        mx=num[i];
//    }
//
//    for (int i=0;i<num.length;i++){
//        if(bool[i]==false) {
//            list.add(num[i]);
//        }
//    }
//
//    Collections.sort(list);
//    System.out.println(list.size());
//    for (int i=0;i<list.size()-1;i++){
//        System.out.print(list.get(i)+" ");
//    }
//    System.out.print(list.get(list.size()-1));
//}

//版本一 不对 太复杂
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(reader.readLine());
//        String[] str = reader.readLine().split(" ");
//        int[] num = new int[str.length];
//        for (int i = 0; i < str.length; i++) {
//            num[i] = Integer.parseInt(str[i]);
//        }
//        boolean[] bool = new boolean[str.length];
//        int count = 0;
//
//        List<Integer> list=new ArrayList<>();
//        for (int i = 0; i < str.length; i++) {
//            if (bool[i] == false) {
//                for (int j = i + 1; j < str.length; j++) {
//                    if (num[i] > num[j]) {
//                        bool[j] = true;
//                        bool[i] =true;
//                        break;
////                        count++;
//                    }
//                }
//                if(bool[i]==false)
//                    list.add(num[i]);
//            }
//        }
//
//        Collections.sort(list);
//        System.out.println(list.size());
//        for (int i=0;i<list.size()-1;i++){
//            System.out.print(list.get(i)+" ");
//        }
//        System.out.print(list.get(list.size()-1));
//    }
