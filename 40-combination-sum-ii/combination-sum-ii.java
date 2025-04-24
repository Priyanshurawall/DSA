class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        Arrays.sort(candidates);
        combination(0, res, curr, target, candidates);
        return res;
    }

    public void combination(int start, List<List<Integer>> res, List<Integer> curr, int target, int[] cand) {
        if(target < 0) return;
        else if(target == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i = start; i < cand.length; i++) {
            if(i > start && cand[i] == cand[i - 1]) continue;  // skip duplicates
            curr.add(cand[i]);
            combination(i + 1, res, curr, target - cand[i], cand);
            curr.remove(curr.size() - 1);  // backtrack
        }
    }
}