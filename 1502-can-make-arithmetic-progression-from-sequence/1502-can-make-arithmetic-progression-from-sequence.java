class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = Math.abs(arr[0]-arr[1]);
        for(int i=2;i<arr.length;i++){
            int sub=Math.abs(arr[i]-arr[i-1]);
            if(diff!=sub){
                return false;
            }
        }
        return true;
    }
}