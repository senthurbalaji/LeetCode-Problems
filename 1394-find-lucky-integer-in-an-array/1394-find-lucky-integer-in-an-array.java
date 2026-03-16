class Solution {
    public int findLucky(int[] arr) 
    {
        HashMap <Integer, Integer> map = new HashMap <>();
        for(int i = 0; i < arr.length; i++)
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        int luckyNo = -1;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == map.get(arr[i]))
                luckyNo = Math.max(luckyNo, arr[i]);
        }
        return luckyNo;
    }
}