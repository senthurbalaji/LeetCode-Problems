class Solution {
     public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }
    private void backtrack(int[] arr, int target, int start, List<Integer> current,List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (target < 0) return;
        for (int i = start; i < arr.length; i++) {
            current.add(arr[i]);                        
            backtrack(arr, target - arr[i], i, current, result); 
            current.remove(current.size() - 1);         
        }
    }
}