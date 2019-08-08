package com.company;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.List;

public class sorttest {
    public void quicksort(int[] nums,int l,int r){
        if(l >= r) return;
        int left = l;
        int right = r;
        int temp = nums[l];
        while(left < right){
            while(left < right && nums[right] >= temp){
                right--;
            }
            while(left < right && nums[left] <= temp){
                left++;
            }
            if(left < right){
                int t = nums[left];
                nums[left] = nums[right];
                nums[right] = t;
            }
        }
        nums[l] = nums[right];
        nums[right] = temp;
        quicksort(nums,l,right-1);
        quicksort(nums,right+1,r);
    }
    public int[] countsort(int[] nums){
        int len = nums.length;
        int num_max = Integer.MIN_VALUE;
        int num_min = Integer.MAX_VALUE;
        for(int i = 0;i < len;++i){
            if(num_max < nums[i]) num_max = nums[i];
            if(num_min > nums[i]) num_min = nums[i];
        }
        int[] counts = new int[num_max - num_min + 1];
        for(int i = 0 ;i < len;++i){
            counts[nums[i]] ++;
        }
        for(int i = 1;i < counts.length;++i){
            counts[i] += counts[i-1];
        }
        int[] res = new int[len];
        for(int i = len;i >=0;--i){
            res[--counts[nums[i]]] = nums[i];
        }
        return res;
    }

    public int[] start(int[] nums){
        this.quicksort(nums,0,nums.length - 1);
        return nums;
    }
}
