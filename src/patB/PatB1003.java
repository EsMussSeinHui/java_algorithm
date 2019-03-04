package patB;

import java.util.Scanner;

/**
 * @Author: hui
 * @Date: 2019/3/4 19:45
 */
public class PatB1003 {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.nextLine();//读取空白行*******************
        boolean bool=true;
        int numP=0,indexP=0;
        int numT=0,indexT=0;
        for(int i=0;i<n;i++){
            String str=scanner.next();
            bool=true;
            numP=0;indexP=0;
            numT=0;indexT=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)!='P'&&str.charAt(j)!='A'&&str.charAt(j)!='T')
                {
                    bool=false;
                    break;
                }
                if(str.charAt(j)=='P'){
                    numP++;
                    indexP=j;
                }
                if(str.charAt(j)=='T'){
                    numT++;
                    indexT=j;
                }
            }
            if(bool&&numT==1&&numP==1&&(indexT-indexP>1)&&(indexP==str.length()-indexT-1||(indexP*(indexT-indexP-1)==str.length()-indexT-1)))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        scanner.close();
    }
}

//if 写的不漂亮，(indexT-indexP!=1) 一开始是觉得没问题，可是有特殊情况啊，找了很久才找到 逻辑一定要100% 不能随意  indexT-indexP>1  ！！！