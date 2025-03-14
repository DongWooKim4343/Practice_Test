class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder(); 
        int row = my_string.length() / m;
        char[][] arr = new char[row][m];

        int index = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = my_string.charAt(index++);
            }
        }

        for (int k = 0; k < row; k++) {
            answer.append(arr[k][c - 1]); 
        }

        return answer.toString(); 
    }
}