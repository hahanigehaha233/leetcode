package com.company;

import java.util.ArrayList;
import java.util.List;

public class number22 {
    StringBuilder t;
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res,"",0,0,n);
        return res;
    }
    public void backtrack(List<String> res,String ans,int l,int r,int n){
        if(l + r == 2*n){
            res.add(ans);
            return;
        }
        if(l < n){
            backtrack(res,ans+'(',l+1,r,n);
        }
        if(r < l){
            backtrack(res,ans+')',l,r+1,n);
        }
    }
}
