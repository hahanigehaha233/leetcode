package com.company;

import java.util.HashMap;
import java.util.Map;

public class number169 {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        int maxcount = 0;
        int count = 0;
        int res = nums[0];
        for(int i = 0; i < nums.length;++i){
            count = m.getOrDefault(nums[i],0) + 1;
            m.put(nums[i],count);
            if(maxcount < count){
                maxcount = count;
                res = nums[i];
            }
        }
        return res;
    }
    public int majorityElement1(int[] nums) {
        int temp=nums[0];
        int count=1;

        for (int i=1;i<nums.length;i++){
            if(count==0){
                temp=nums[i];
                count++;
            }else if(temp==nums[i]){
                count++;
            }else {
                count--;
            }

        }


        return temp;
    }
}
