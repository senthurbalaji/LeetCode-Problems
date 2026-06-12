class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        int sum=0;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()){
            int value = entry.getKey();
            int count = entry.getValue();
            if (count % k == 0) {
                sum += value * count;
            }
        }
        return sum;
    }
}