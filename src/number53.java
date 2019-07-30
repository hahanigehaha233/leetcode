package com.company;

public class number53 {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        if(len == 0) return 0;
        int res = nums[0];
        int t = 0;
        for(int i = 0;i < len;++i){
            if(nums[i] <= 0){
                res = Math.max(res,nums[i]);
                continue;
            }
            t = 0;
            for(int j = i; j < len;++j){
                t += nums[j];
                if(t > 0){
                    res = Math.max(res,t);
                    continue;
                }else{
                    i = j;
                    break;
                }
            }
        }
        return res;
    }
}
