class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> smaller=new ArrayList<>();
        ArrayList<Integer> equal=new ArrayList<>();
        ArrayList<Integer> greater=new ArrayList<>();

        int n=nums.length;
        for(int i=0;i<n;i++){
            if(pivot<nums[i]){
                greater.add(nums[i]);
            }else if(pivot>nums[i]){
                smaller.add(nums[i]);
            }else if(nums[i]==pivot){
                equal.add(nums[i]);
            }
        }

        int res[]=new int[n];
        int index=0;
        for(int num:smaller){
            res[index++]=num;
        }
        for(int num:equal){
            res[index++]=num;
        }
        for(int num:greater){
            res[index++]=num;
        }
        return res;
    }
}