import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class number90 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> ans;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        res.add(new ArrayList<>());
        int start = res.size();
        for(int i = 0;i < nums.length;++i){
            List<List<Integer>> res_tmp = new ArrayList<>();
            for(int j = 0;j < res.size();++j){
                if(i > 0 && nums[i] == nums[i - 1] && j < start){
                    continue;
                }
                ans = new ArrayList<>(res.get(j));
                ans.add(nums[i]);
                res_tmp.add(ans);
            }
            start = res.size();
            res.addAll(res_tmp);
        }
        return res;
    }
}
