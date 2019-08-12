package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class number40 {
    public List<List<Integer>> res = new ArrayList<>();
    public List<Integer> ans = new ArrayList<>();

    public void backtrack(int[] candidates,int index,int others,List<Integer> ans){
        if(others < 0){
        }else{
            for(int i = index;i < candidates.length;++i){
                if( i - 1 >= index && candidates[i] == candidates[i-1]){
                    continue;
                }
                if(others - candidates[i] == 0){
                    ans.add(candidates[i]);
                    res.add(new ArrayList<>(ans));
                    ans.remove(ans.size() - 1);
                }else if(others - candidates[i] > 0){
                    ans.add(candidates[i]);
                    backtrack(candidates,i+1,others - candidates[i],ans);
                    ans.remove(ans.size() - 1);
                }else{
                    return;
                }
            }
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(candidates,0,target,ans);
        return res;
    }
}
