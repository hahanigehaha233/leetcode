package com.company;


public class number215 {
    public void swap(int[] nums,int l,int r){
        int tmp = nums[l];
        nums[l] = nums[r];
        nums[r] = tmp;
    }
    public int findK(int[] nums,int k,int start,int end){
        int l = start;
        int r = end;
        int mid = nums[l];
        while(l < r){
            while (l < r && mid <= nums[r]){
                --r;
            }
            while (l < r && mid >= nums[l]){
                ++l;
            }
            if(l < r) swap(nums,l,r);
        }
        swap(nums,start,l);
        if(l == nums.length - k){
            return nums[l];
        }else if(l > nums.length - k){
            return findK(nums,k,start,l-1);
        }else{
            return findK(nums,k,l+1,end);
        }
    }
    public int findKthLargest(int[] nums, int k) {
        return findK(nums,k,0,nums.length-1);
    }
}
