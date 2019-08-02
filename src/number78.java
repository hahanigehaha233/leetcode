import java.util.ArrayList;
import java.util.List;

public class number78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res.add(new ArrayList<>());
        for(int i = 0;i < nums.length;++i){
            int k = res.size();
            for(int j = 0;j < k;++j){
                List<Integer> newSub = new ArrayList<Integer>(res.get(j));
                newSub.add(nums[i]);
                res.add(newSub);
            }
        }
        return res;
    }
}
