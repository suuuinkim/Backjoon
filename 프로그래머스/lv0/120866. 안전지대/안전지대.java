class Solution {
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static int cnt =0;
    public void DFS(int x, int y, int[][] arr, int len){
        arr[x][y] = 1;
        for(int i=0; i<8; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && nx<len && ny>=0 && ny<len && arr[nx][ny] == 0){
                arr[nx][ny] = 1;
            }
        }
    }
    public int solution(int[][] board) {
        int answer = 0;
        int len = board.length;
        int[][] arr = new int[len][len];
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                if(board[i][j] == 1){
                    DFS(i, j, arr, len);
                }
            }
        }
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                // System.out.print(arr[i][j] + " ");
                if(arr[i][j] == 0) answer++;
            }
        }
        return answer;
    }
}