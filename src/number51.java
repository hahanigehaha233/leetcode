package com.company;

import java.util.ArrayList;
import java.util.List;

public class number51 {
    public List<List<String>> res = new ArrayList<>();
    public List<String> ans = new ArrayList<>();
    public boolean[][] mark;
    public boolean judgey(boolean[][] mark,int index){
        for(int i = 0;i < mark[0].length;++i){
            if(mark[i][index]){
                return false;
            }
        }
        return true;
    }
    public boolean judge(boolean[][] mark,int indexx,int indexy,int n){
        int x = indexx - 1;
        int y = indexy - 1;
        while(x >=0 && y >= 0){
            if(mark[x][y]){
                return false;
            }
            --x;
            --y;
        }
        x = indexx - 1;
        y = indexy + 1;
        while (x >= 0 && y < n){
            if(mark[x--][y++]){
                return false;
            }
        }
        return true;
    }
    public void backtrack(int n,int depth,boolean[][] mark){
        if(depth == n){
            res.add(new ArrayList<String>(ans));
        }
        for(int i = 0;i < n;++i){
            if(judgey(mark,i) && judge(mark,depth,i,n)){
                StringBuilder s = new StringBuilder();
                int j = 0;
                while (j < i){
                    s.append('.');
                    ++j;
                }
                s.append('Q');
                while (j < n - 1){
                    s.append('.');
                    ++j;
                }
                mark[depth][i] = true;
                ans.add(s.toString());
                backtrack(n,depth + 1,mark);
                ans.remove(ans.size() - 1);
                mark[depth][i] = false;
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        mark = new boolean[n][n];
        backtrack(n,0,mark);
        return res;
    }
}
