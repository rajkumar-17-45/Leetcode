import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

class Solution {
    static List<List<Integer>> ans = new ArrayList<>();

    List<List<Integer>> comsum(List<Integer> a, int target) {
        ArrayList<Integer> temp = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>(a);
        a.clear();
        a.addAll(set);
        Collections.sort(a);
        findnumbers(a, temp, target, 0);
        return ans;
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans.clear(); 
        List<Integer> a = new ArrayList<>();
        for (int i : candidates) {
            a.add(i);
        }
        comsum(a, target);
        return ans;
    }

    void findnumbers(List<Integer> a, List<Integer> temp, int target, int index) {
        if (target == 0) {
            ans.add(new ArrayList<>(temp)); 
            return;
        }
        for (int i = index; i < a.size(); i++) {
            if (target - a.get(i) >= 0) {
                temp.add(a.get(i)); 
                findnumbers(a, temp, target - a.get(i), i);
                temp.remove(temp.size() - 1); 
            }
        }
    }
}
