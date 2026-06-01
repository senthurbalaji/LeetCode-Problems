class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int sum = 0;
        if(cost.length < 3){
            for(int i=0;i<cost.length;i++){
                sum+=cost[i];
            }
        }else{
            for(int i=cost.length-1;i>=0;i--){
                if((cost.length-1-i)%3 != 2) sum+=cost[i];
            }
        }
        return sum;
    }
}