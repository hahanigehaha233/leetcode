

import java.util.ArrayList;
import java.util.List;

public class number22 {
//    StringBuilder t;
//    public List<String> generateParenthesis(int n) {
//        List<String> res = new ArrayList<>();
//        backtrack(res,"",0,0,n);
//        return res;
//    }
//    public void backtrack(List<String> res,String ans,int l,int r,int n){
//        if(l + r == 2*n){
//            res.add(ans);
//            return;
//        }
//        if(l < n){
//            backtrack(res,ans+'(',l+1,r,n);
//        }
//        if(r < l){
//            backtrack(res,ans+')',l,r+1,n);
//        }
//    }
    List<String> res;
    public List<String> generateParenthesis(int n) {
        res = new ArrayList<>();
        backtrack(n,0,0,"");
        return res;
    }
    public void backtrack(int n,int l,int r,String s){
        if(n == r){
            res.add(new String(s));
            return;
        }
        if(l < n){
            backtrack(n,l+1,r,s+'(');
        }if(r < l){
            backtrack(n,l,r+1,s+')');
        }
    }
}
