package com.company;

import java.util.HashSet;
import java.util.Set;

public class number349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int val:nums1){
            set1.add(val);
        }
        for(int val:nums2){
            set2.add(val);
        }
        set1.retainAll(set2);

        int[] res = new int[set1.size()];
        int index = 0;
        for(int val:set1){
            res[index++] = val;
        }
        return res;
    }
}
