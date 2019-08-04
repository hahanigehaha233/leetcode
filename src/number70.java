public class number70 {
    public int climbStairs(int n) {
        if(n < 4) return n;
        int[] res = new int[n];
        res[0] = 1;
        res[1] = 2;
        for(int i = 2; i < n;++i){
            res[i] = res[i-2] + res[i-1];
        }
        return res[n-1];
    }
}
