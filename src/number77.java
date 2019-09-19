package com.company;

import java.util.ArrayList;
import java.util.List;

public class number77 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> ans = new ArrayList<>();
    public void backtrack(int c,int n,int k,int now){
        if(c == k){
            res.add(new ArrayList<>(ans));
        }
        for(int i = now;i <= n;++i){
            ans.add(i);
            backtrack(c+1,n,k,i+1);
            ans.remove(ans.size() - 1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        backtrack(0,n,k,1);
        return res;
    }
}
