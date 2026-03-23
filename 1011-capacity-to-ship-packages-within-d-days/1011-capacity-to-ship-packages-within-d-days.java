class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0,high=0;
        int sum=0;
        for(int i=0;i<weights.length;i++){
            low=Math.max(low,weights[i]);
            high+=weights[i];
        }
        while(low<high){
            int mid=(low+high)/2;
            if(helper(weights,mid)<=days){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public int helper(int[] weights,int mid){
        int curr=0;
        int d=1;
        for(int num:weights){
            if(curr+num>mid){
                d+=1;
                curr=num;
            }else{
                curr+=num;
            }
        }
        return d;
    }
}