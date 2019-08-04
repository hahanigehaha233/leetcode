package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class number5147 {
    public int findl(int[] nums){
        List<Integer> l = new ArrayList<>();
        List<Integer> r = new ArrayList<>();
        for(int i = 0; i<nums.length;++i){
            if(i % 2 == 0){
                l.add(nums[i]);
            }else{
                r.add(nums[i]);
            }
        }
        int res = 0;
        if(l.get(0) >= r.get(0)){
            res = l.get(0) - r.get(0) + 1;
        }
        for(int i = 1; i < l.size();++i){
            if(i - 1 < r.size()){
                if(l.get(i) >= r.get(i - 1)){
                    res += l.get(i) - r.get(i - 1) + 1;
                    l.set(i,r.get(i-1) -1);
                }
            }
             if(i < r.size()){
                if(l.get(i) >= r.get(i)){
                    res += l.get(i) - r.get(i) + 1;
                    l.set(i,r.get(i) -1);
                }
            }
        }
        return res;
    }
    public int findr(int[] nums) {
        List<Integer> l = new ArrayList<>();
        List<Integer> r = new ArrayList<>();
        for(int i = 0; i<nums.length;++i){
            if(i % 2 == 0){
                l.add(nums[i]);
            }else{
                r.add(nums[i]);
            }
        }
        int res = 0;
        for(int i = 0;i < r.size();++i){
            if(i < l.size()){
                if(r.get(i) >= l.get(i)){
                    res += r.get(i) - l.get(i) + 1;
                    r.set(i,l.get(i) - 1);
                }
            }
            if(i + 1 < l.size()){
                if(r.get(i) >= l.get(i+1)){
                    res += r.get(i) - l.get(i + 1) + 1;
                    r.set(i,l.get(i + 1) - 1);
                }
            }
        }
        return res;
    }
    public int movesToMakeZigzag(int[] nums) {
        if(nums.length < 2) return 0;
        int res = findl(nums);
        res = Math.min(res,findr(nums));
        return res;
    }
}
