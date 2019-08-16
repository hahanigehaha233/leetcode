import java.util.ArrayList;
import java.util.List;

public class number216 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> ans = new ArrayList<>();
    public void backtrack(int k,int others,int index){
        if(k == 0){
            if(others == 0) {
                res.add(new ArrayList<>(ans));
                return;
            }else{
                return;
            }
        }
        for(int i = index;i < 10;++i){
            others -= i;
            if(others < 0){
                return;
            }else{
                ans.add(i);
                backtrack(k - 1,others,i + 1);
                others += i;
                ans.remove(ans.size() - 1);
            }
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        backtrack(k,n,1);
        return res;
    }
}
