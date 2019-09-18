package com.company;

import java.util.ArrayList;
import java.util.List;

public class number78 {
    List<List<Integer>> res;
    public void backtrack(int i,List<Integer> tmp,int[] nums){
        res.add(new ArrayList<>(tmp));
        for(int j = i;j < nums.length;++j){
            tmp.add(nums[j]);
            backtrack(j+1,tmp,nums);
            tmp.remove(tmp.size() - 1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        res = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        backtrack(0,tmp,nums);
        return res;
    }
}
