class Solution {
    int solution(int[][] land) {
        int n = land.length;
        
        int[][] arr = new int[n][4];
        
        for(int j=0; j<4; j++){
            arr[0][j] = land[0][j];
        }
        
        for(int i =1; i<n;i++){
            for(int j=0; j<4;j++){
                int maxNum = 0;
                for(int k=0; k<4; k++){
                    if(k!=j){
                        maxNum=Math.max(maxNum,arr[i-1][k]);
                    }
                }
                arr[i][j]=land[i][j]+maxNum;
            }
        }
        int answer = 0;
        for (int j = 0; j < 4; j++) {
            answer = Math.max(answer, arr[n - 1][j]);
        }

        return answer;
    }
}