package medium;

import java.util.List;

public class WordBreak139 {
    //s can use wordDict element more than once
    //s and wordDict are non-empty
    
    
    /**Others DP solution*/
    public boolean wordBreak2(String s, List<String> wordDict) {
        boolean dp[] = new boolean[s.length() + 1];
        dp[0] = true;
        for(int i = 1; i <= s.length(); i++) {
            for(int j = i - 1; j >= 0; j--) {
                if(dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
    /**My TLE solution*/
    int len;
    public boolean wordBreak(String s, List<String> wordDict) {
        len = s.length();
        return dfs(0, 1, s, wordDict);

    }
    private boolean dfs(int p1, int p2, String s, List<String> dict) {
        if(p1 == len) return true;
        // if(p1 == 0 && p2 == len) return false;
        // System.out.println(p1 + " " + p2);
        String sub = s.substring(p1, p2);
        if(dict.contains(sub)) {
            if(dfs(p2, p2 + 1, s, dict)) return true;
        }
        //terminate recur condition
        if(p2 == len) return false;
        //if doesn't contain and not reach the end
        return dfs(p1, p2 + 1, s, dict);
    }
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(s.substring(4, 8));
    }

}
