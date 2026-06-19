class Solution {
    public int largestAltitude(int[] gain) {
        ArrayList<Integer> lst=new ArrayList<>();
        lst.add(0);
        for(int i=1;i<=gain.length;i++){
            lst.add(lst.get(i-1)+gain[i-1]);
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<lst.size();i++){
            max=Math.max(max,lst.get(i));
        }
        return max;
    }
}