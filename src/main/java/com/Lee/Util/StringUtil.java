package com.Lee.Util;

public class StringUtil {
    public static boolean compare(String str1,String str2){
        boolean flag=false;
        if(str1!=null&&str2!=null)
            if(str1.equals(str2))flag=true;
        return flag;
    }

}
