class Solution {
    public List<Integer> grayCode(int n) {
        ArrayList<Integer> res=new ArrayList<>();
        int limit = 1 << n;
        for(int i = 0; i < limit; i++) {
            res.add(i ^ (i >> 1));
        }
        return res;
    }
}