public class number509 {
    //8%
//    public int backtrack(int i){
//        if(i == 0){
//            return 0;
//        }if(i == 1){
//            return 1;
//        }
//        return backtrack(i - 1) + backtrack(i - 2);
//    }
//    public int fib(int N) {
//        return backtrack(N);
//    }


    public int fib(int N){//100%
        int[] res = new int[N + 1];
        res[0] = 0;
        res[1] = 1;
        for(int i = 2;i <= N;++i){
            res[i] = res[i - 1] + res[i - 2];
        }
        return res[N];
    }
}
