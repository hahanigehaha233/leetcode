package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class number90 {
    public List<List<Integer>> backtrack(List<List<Integer>> res,List<Integer> ans,int i,int[] nums){
        res.add(new ArrayList<>(ans));
        for(int j = i + 1;j < nums.length;++j){
            if(j > 0 && nums[j] == nums[j - 1]){
                continue;
            }
            ans.add(nums[j]);
            res = backtrack(res,ans,j+1,nums);
            ans.remove(ans.size() - 1);
        }
        return res;
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        res = backtrack(res,ans,0,nums);
        return res;
    }
}
