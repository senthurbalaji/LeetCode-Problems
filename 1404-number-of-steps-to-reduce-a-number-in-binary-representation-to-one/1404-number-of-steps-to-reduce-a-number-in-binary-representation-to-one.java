import java.math.BigInteger;
class Solution {
    public int numSteps(String s) {
        int count=0;
        if(s.length()<64){
            long n=Long.parseLong(s,2);
            while(n!=1){
                if(n%2==0) n/=2;
                else n+=1;
                count++;
            }
        }else{
            BigInteger n=new BigInteger(s,2);
            BigInteger one = BigInteger.ONE;
            BigInteger two = BigInteger.valueOf(2);
            while(!n.equals(one)){
                if(n.mod(two).equals(BigInteger.ZERO))
                    n=n.divide(two);
                else 
                    n=n.add(one);
                count++;
            }
        }
        return count;
    }
}