package com.company;

public class sorttest {
    public void quicksort(int[] nums,int l,int r){
        if(l == r) return;
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
    public int[] start(int[] nums){
        this.quicksort(nums,0,nums.length - 1);
        return nums;
    }
}
