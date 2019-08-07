package com.company;

public class number274 {
    public int hIndex(int[] citations) {
        int len = citations.length;
        int[] papaers = new int[len+1];
        for(int val:citations){
            papaers[Math.min(val,len)] ++;
        }
        int k = len;
        for(int n = papaers[len]; k > n ;n +=papaers[k]){
            k--;
        }
        return k;
    }
}
