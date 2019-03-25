package Third;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class text
{
    public static void main(String [] args)throws UnsupportedEncodingException{
        String string="我abc日ni妈";
        String str=subStr(string,6);
        System.out.println(str);
    }

    public static String subStr(String str, int subSLength)
            throws UnsupportedEncodingException
    {

        if (str == null)
            return null;
        else
        {
            int tempSubLength = subSLength;//截取字节数
            subSLength=subSLength>str.length()?str.length():subSLength;
            String subStr = str.substring(0, subSLength);//截取的子串

            int subStrByetsL = subStr.getBytes("GBK").length;//截取子串的字节长度

            // 说明截取的字符串中包含有汉字
            while (subStrByetsL > tempSubLength)
            {
                subStr = str.substring(0, --subSLength);
                subStrByetsL = subStr.getBytes("GBK").length;
            }
            return subStr;
        }

    }
}

