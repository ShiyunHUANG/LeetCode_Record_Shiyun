package medium;

import java.util.ArrayList;
import java.util.List;

public class FactorCombinations254 {
    List<List<Integer>> solution = new ArrayList<List<Integer>>();
    public List<List<Integer>> getFactors(int n) {
        List<Integer> small = smallestFactors(n);
        dfs(small, 0, 1, new ArrayList<Integer>());
        return solution;
        
    }
    private List<Integer> smallestFactors(int n) {
        List<Integer> res = new ArrayList<Integer>();
        if(n < 4) return res;
        for (int i = 2; i < n && n > 3; ) {
            if(n % i == 0) {
                res.add(i);
                n = n / i;
                i = 2;
            } else {
                i++;
            }
        }
        res.add(n);
        return res;
    }
    private void dfs(List<Integer> list, int pos, int multi, List<Integer> factors){
        int ori = factors.size();
        //terminate condition
        if (pos == list.size()) {
            solution.add(factors);
            return;
        } 
        //keep it
        if(multi > 1) {
            factors.add(multi);
        }
        factors.add(list.get(pos));
        dfs(list, pos + 1, 1, factors);    
        //multiple it
        dfs(list, pos + 1, multi * list.get(pos), factors);
        factors.subList(0, ori);
        
    }
}
