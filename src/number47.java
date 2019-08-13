package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class number47 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> ans = new ArrayList<>();
    boolean[] mark;
    public void backtrack(int[] nums,boolean[] mark,int depth){
        if(depth == nums.length){
            res.add(new ArrayList<>(ans));
        }
        for(int i = 0;i < nums.length;++i){
            if(!mark[i]){
                if(i > 0 && nums[i] == nums[i - 1] && !mark[i - 1]){
                    continue;
                }
                mark[i] = true;
                ans.add(nums[i]);
                backtrack(nums,mark,depth + 1);
                ans.remove(ans.size() - 1);
                mark[i] = false;
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        mark = new boolean[nums.length];
        backtrack(nums,mark,0);
        return res;
    }
}
