package com.company;

public class moni814 {
    public int findLess(int[] nums,int l,int r){
        if(l >= r) return l;
        int mid = (l + r) /2;
        if(nums[mid] >= nums[0]){
            return findLess(nums,mid+1,r);
        }else{
            return findLess(nums,l,mid);
        }
    }
    public int findbinary(int[] nums,int l,int r,int target){
        if(l > r) return -1;
        int mid = (l + r) / 2;
        if(nums[mid] == target){
            return mid;
        }else if(nums[mid] > target){
            return findbinary(nums,l,mid - 1,target);
        }else{
            return findbinary(nums,mid + 1,r,target);
        }

    }
    public int findTarget(int[] nums,int index,int target){
        if(index == nums.length){
            return findbinary(nums,0,nums.length - 1,target);
        }else{
            if(nums[nums.length - 1] >= target){
                return findbinary(nums,index,nums.length - 1,target);
            }else{
                return findbinary(nums,0,index - 1,target);
            }
        }
    }
    public int search(int[] nums, int target) {
        int index = findLess(nums,0,nums.length);
        //return index;
        return findTarget(nums,index,target);
    }

    public String complexNumberMultiply(String a, String b) {
        String[] as = a.split("\\+");
        String[] bs = b.split("\\+");
        String at = as[1].substring(0,as[1].length() - 1);
        String bt = bs[1].substring(0,bs[1].length() - 1);
        int head = Integer.parseInt(as[0]) * Integer.parseInt(bs[0]) + -1 *Integer.parseInt(at) * Integer.parseInt(bt);
        int mid = Integer.parseInt(as[0]) * Integer.parseInt(bt) + Integer.parseInt(bs[0]) * Integer.parseInt(at);
        StringBuilder res = new StringBuilder(Integer.toString(head));
        res.append("+");
        res.append(Integer.toString(mid));
        res.append("i");
        return res.toString();
    }

}
