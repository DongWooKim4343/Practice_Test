class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String aaa=String.valueOf(a);
        String bbb=String.valueOf(b);
        String ab = aaa+bbb;
        String ba = bbb+aaa;
        int abNum= Integer.parseInt(ab);
        int baNum= Integer.parseInt(ba);
        if(abNum>=baNum){
            answer=abNum;
        }else{
            answer=baNum;
        }
        return answer;
    }
}