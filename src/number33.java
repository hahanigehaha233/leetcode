package com.company;
public class number33 {
    public int findIndex(int[] nums, int target,int left, int right){
        if(left == right){
            return left;
        }
        int middle = (left + right) >> 1;
        if(nums[middle] > nums[right]){
            return findIndex(nums,target,middle+1,right);
        }else{
            return findIndex(nums,target,left,middle);
        }
    }
    public int findTarget(int[] nums, int target,int left, int right){
        if(left > right){
            return -1;
        }
        int middle = (left + right) >> 1;
        if(nums[middle] == target) return middle;
        if(nums[middle] > target){
            return findTarget(nums,target,left,right-1);
        }else{
            return findTarget(nums,target,middle+1,right);
        }
    }
    public int search(int[] nums, int target) {
        if(nums.length == 0) return -1;
        if(target == nums[0]) return 0;
        int index = findIndex(nums,target,0,nums.length-1);
        if(index == 0) return findTarget(nums,target,0,nums.length-1);
        if(target > nums[0]) return findTarget(nums,target,0,index-1);
        else return findTarget(nums,target,index,nums.length-1);
    }
}
