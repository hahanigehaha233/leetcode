import java.lang.Math;
public class number12 {
    public int maxArea(int[] height){
        if(height.length == 2){
            return height[0]*height[1];
        }
        int i = 0;
        int j = height.length-1;
        int res = 0;
        while (i < j){
            res = Math.max(res,(j-i)*Math.min(height[i],height[j]));
            if(height[i] < height[j]){
                ++i;
            }else if(height[i] > height[j]){
                --j;
            }else{
                ++i;
                --j;
            }
        }
        return res;
    }
}
