class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String str2="";
        for(int i=0;i<words.length;i++){
            String str=words[i];
            int sum=0;
            for(int j=0;j<str.length();j++){
                int idx = str.charAt(j) - 'a';
                sum+=weights[idx];
            }
            str2+=((char)('z'-(sum%26)));
        }
        return str2;
    }
}