package com.company;

public class number718 {
    public int findLength(int[] A, int[] B) {
        int[][] res = new int[A.length][B.length];
        for(int i = 0; i < A.length;++i){
            res[i][0] = A[i] == B[0] ? 1:0;
        }
        for(int j = 0; j < B.length;++j){
            res[0][j] = A[0] == B[j] ? 1:0;
        }
        int res_max = 0;
        for(int i = 1;i < A.length;++i){
            for(int j = 1;j < B.length;++j){
                if(A[i] == B[j]){
                    res[i][j] = res[i-1][j-1] + 1;
                }
                res_max = Math.max(res_max,res[i][j]);
            }
        }
        return res_max;
    }
}
