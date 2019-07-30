package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class number46 {
    public void selectIndex(ArrayList<Integer> nums_lst,int index,int[] nums) {
        if(index == n) res.add(new ArrayList<Integer>(nums_lst));
        for(int i = 0;i < n;++i){
            if(arr[i] == 1){
                continue;
            }
            arr[i] = 1;
            nums_lst.add(nums[i]);
            selectIndex(nums_lst,index+1,nums);
            nums_lst.remove(nums_lst.size()-1);
            arr[i] = 0;
        }
    }
    int n=0;
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    int[] arr;
    public List<List<Integer>> permute(int[] nums) {
        n = nums.length;
        arr = new int[n];
        for(int i = 0;i < n;++i){
            arr[i] = 0;
        }
        ArrayList<Integer> nums_lst = new ArrayList<Integer>();
        selectIndex(nums_lst,0,nums);
        return res;
    }
}
