import java.util.Arrays;

public class number16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[2];
        for(int i=0;i<nums.length;i++) {
            int start = i+1, end = nums.length - 1;
            while(start < end) {
                int sum = nums[start] + nums[end] + nums[i];
                if(Math.abs(target - sum) < Math.abs(target - res))
                    res = sum;
                if(sum > target)
                    end--;
                else if(sum < target)
                    start++;
                else
                    return res;
            }
        }
        return res;
    }
}
