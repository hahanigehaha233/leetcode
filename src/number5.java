public class number5 {
    public String longestPalindrome(String s) {
        StringBuilder ss = new StringBuilder(2001);
        int len = s.length();
        if(len < 2) return s;
        ss.append('#');
        for(int i =0;i<len;i++){
            ss.append(s.charAt(i));
            ss.append('#');
        }
        int cc = 0;
        int mark = 0;
        for(int i = 1;i < ss.length();i++){
            int c = 0;
            int j = i + 1;
            int k = i - 1;
            while (j < ss.length() && k >= 0){
                if(ss.charAt(j) == ss.charAt(k)){
                    ++j;
                    --k;
                    c++;
                }else{
                    break;
                }
            }
            if(cc < c){
                mark = i;
                cc = c;
            }
        }
        StringBuilder res = new StringBuilder(100);
        for(int i = mark - cc;i < mark + cc;i++){
            if(ss.charAt(i) == '#'){
                continue;
            }
            else {
                res.append(ss.charAt(i));
            }
        }
        return res.toString();
    }
}
