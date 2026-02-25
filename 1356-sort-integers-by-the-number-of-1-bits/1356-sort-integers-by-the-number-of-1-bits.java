class Solution {
    public int[] sortByBits(int[] arr) {
        int a=10001;
        for(int i=0;i<arr.length;i++){
            arr[i]+=Integer.bitCount(arr[i])*a;
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            arr[i]%=a;
        }
        return arr;
    }
}