import java.util.ArrayList;
import java.util.List;

public class number78 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        res.add(new ArrayList<>());
        for(int  i = 0;i < nums.length;++i){
            int k = res.size();
            for(int j = 0;j < k;++j){
                ans = new ArrayList<>(res.get(j));
                ans.add(nums[i]);
                res.add(ans);
            }
        }
        return res;
    }
}
