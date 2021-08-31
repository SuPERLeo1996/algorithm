package org.leo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CombinationSum.java
 * @Author gonglinjie
 * @Description 39.组合总和
 * @Date 2021/3/26
 */
public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> combinationList = new ArrayList<>();

        dfs(candidates,target,result,combinationList,0);
        return result;
    }

    private void dfs(int[] candidates, int target, List<List<Integer>> result, List<Integer> combinationList, int idx) {
        if (idx == candidates.length) {
            return;
        }
        if (target == 0) {
            result.add(new ArrayList<>(combinationList));
            return;
        }
        dfs(candidates,target,result,combinationList,idx + 1);

        if (target - candidates[idx] >= 0) {
            combinationList.add(candidates[idx]);
            dfs(candidates,target - candidates[idx],result,combinationList,idx);
            combinationList.remove(combinationList.size() - 1);
        }
    }
}
