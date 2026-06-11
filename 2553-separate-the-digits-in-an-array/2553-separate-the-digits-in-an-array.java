class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            String n=String.valueOf(nums[i]);
            for(int j=0;j<n.length();j++){
                res.add(n.charAt(j)-'0');
            }
        }
        int arr[]=new int[res.size()];
        for(int i=0;i<res.size();i++){
            arr[i]=res.get(i);
        }
        return arr;
    }
}