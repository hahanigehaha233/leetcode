package com.company;

import java.util.Arrays;

public class number164 {
    public int maximumGap(int[] nums) {
        if(nums.length < 2) return 0;
        int nums_max = Integer.MIN_VALUE;
        int nums_min = Integer.MAX_VALUE;
        for(int i = 0 ;i < nums.length;++i){
            if(nums[i] > nums_max){
                nums_max = nums[i];
            }
            if(nums[i] < nums_min){
                nums_min = nums[i];
            }
        }
        if(nums_max == nums_min) return 0;
        int[] maxBuckets = new int[nums.length + 1];
        Arrays.fill(maxBuckets, -1);
        int[] minBuckets = new int[nums.length + 1];
        Arrays.fill(minBuckets,-1);

        int bucketSize  = (int)Math.ceil((double)(nums_max - nums_min)/(nums.length - 1));

        int buckets =(nums_max - nums_min) / bucketSize + 1;

        int[] maxBuk = new int[buckets];
        int[] minBuk = new int[buckets];

        for(int i = 0;i < nums.length;++i){
            int index = (nums[i] - nums_min) / bucketSize ;
            maxBuk[index] = Math.max(nums[i], maxBuk[index]);
            minBuk[index] = Math.min(nums[i], minBuk[index]);
        }
        int gap = 0;
        int pre = maxBuk[0];
        for(int i = 1;i < nums.length;++i){
            if(maxBuk[i]==Integer.MIN_VALUE && minBuk[i]==Integer.MAX_VALUE){  //忽略空桶
                continue;
            }
            gap = Math.max(gap,minBuk[i] - pre);
            pre = maxBuk[i];
        }
        return gap;
    }
}
