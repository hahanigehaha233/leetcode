public class number14 {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if(len == 0) return "";
        String res = strs[0];
        for(int i = 1;i < len;++i){
            int j = 0;
            for(;j < res.length()&&j < strs[i].length();++j){
                if(res.charAt(j) != strs[i].charAt(j)){
                    break;
                }
            }
            res = res.substring(0,j-1);
            if(res.equals("")){
                return "";
            }
        }
        return res;
    }
}
