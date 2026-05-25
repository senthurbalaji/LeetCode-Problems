class Solution {
    public boolean areNumbersAscending(String s) {
        int prev=-1;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                if(prev<num){
                    prev=num;
                }else{
                    return false;
                }
            }
        }
        return true;
        
    }
}