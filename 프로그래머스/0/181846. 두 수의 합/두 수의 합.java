import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        
        BigInteger nA = new BigInteger(a);
        BigInteger nB = new BigInteger(b);
        BigInteger sum = nA.add(nB);
        return sum.toString();
    }
}