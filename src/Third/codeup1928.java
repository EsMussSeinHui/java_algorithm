package Third;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @Author: hui
 * @Date: 2019/3/3 19:03
 * 书上的c++用的是 先格式话，日期不断+1,判断月（293031）和瑞年
 * 思想学习一下
 * 但既然是java 能偷懒就偷懒的，下面两者都实现一下吧
 */
public class codeup1928 {
    static int [] month={0,31,28,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
//        javaCal(str1, str2);
        cCal(str1,str2);
    }

    /*
      主要入门一下Date类
     */
    static void javaCal(String str1, String str2) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date date1 = sdf.parse(str1);
        Date date2 = sdf.parse(str2);
        long state = date1.getTime();//计算时间到1970-01-01 之差，以long返回秒数：
        long end = date2.getTime();
        System.out.println(state/ (24 * 60 * 60 * 1000));//题目要求
        long day = (end - state) / (24 * 60 * 60 * 1000);
        System.out.println(day + 1);//题目要求
    }

    static void cCal(String str1,String str2){
        int y1,m1,d1,y2,m2,d2;
        if(Integer.parseInt(str2)<Integer.parseInt(str1)){
            String str=str1;
            str1=str2;
            str2=str;
        }
        y1=Integer.parseInt(str1.substring(0,4));
        m1=Integer.parseInt(str1.substring(4,6));
        d1=Integer.parseInt(str1.substring(6,8));
        int time=Integer.parseInt(str2);
        y2=time/10000; //留头去尾 /
        m2=time%10000/100;  //取中间， 先去头，再取头 % /
        d2=time%100;   //留尾去头 %

        int ans=1;
        boolean bool=isLeap(y1);
        while(y1<y2||m1<m2||d1<d2){
            d1++;
            if(d1==(month[m1]+1)||(m1==2&&d1==(29+1)))//逻辑是闰年 29+1 再更新
            {
                if(m1==2&&d1==29&&bool)
                {
                    //d1++;
                }
                else{
                    m1++;
                    d1=1;
                }
            }
            if(m1==13)
            {
                y1++;
                bool=isLeap(y1);
                m1=1;
            }
            ans++;
        }
        System.out.println(ans);
    }

    public static boolean isLeap(int year)
    {
        return (year%4==0&&year%100!=0)||(year%400==0);
    }
}
