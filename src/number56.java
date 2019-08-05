package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class number56 {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        if(intervals.length == 0 || intervals == null) return res.toArray(new int[0][]);
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        int i = 0;
        while(i < intervals.length){
            int left = intervals[i][0];
            int right = intervals[i][1];
            while(i + 1 < intervals.length &&intervals[i + 1][0] <= right){
                i++;
                right = Math.max(right,intervals[i][1]);
            }
            res.add(new int[]{left,right});
            ++i;
        }
        return res.toArray(new int[0][]);
    }
}
