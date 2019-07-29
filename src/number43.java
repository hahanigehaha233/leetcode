package com.company;

public class number43 {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";
        StringBuilder s = new StringBuilder(111);
        StringBuilder res = new StringBuilder(220);
        for(int i = 0;i <= num2.length();++i){
            res.append(String.valueOf(0));
        }
        s.append(String.valueOf(0));
        for(int i = num1.length()-1;i >= 0;--i){
            int o = 0;
            s.delete(0,s.length());
            for(int j = num2.length()-1;j>=0;--j){
                int t = (num1.charAt(i)-'0')*(num2.charAt(j)-'0')+o;
                o=0;
                if(t > 9){
                    s.append(String.valueOf(t%10));
                    o = t/10;
                }else{
                    s.append(String.valueOf(t));
                    o=0;
                }
            }
            if(o != 0){
                s.append(String.valueOf(o));
            }
            o = 0;
            for(int k = 0;k < s.length();++k){
                int t  = (res.charAt(k+num1.length() -1 - i)-'0') + (s.charAt(k)-'0') + o;
                if(t > 9){
                    res.replace(k+num1.length() -1 - i,k+num1.length() -1 - i+1,String.valueOf(t%10));
                    o = t/10;
                }else{
                    res.replace(k+num1.length() -1 - i,k+num1.length() -1 - i+1,String.valueOf(t));
                    o=0;
                }
            }
            if( o != 0){
                res.replace(num1.length()-1 - i + s.length(),s.length()+num1.length() -1 - i+1,String.valueOf(o));
            }
            res.append(0);
        }
        res.reverse();
        while(res.charAt(0) == '0'){
            res.delete(0,1);
        }
        return res.toString();
    }
}
