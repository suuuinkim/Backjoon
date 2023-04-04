import java.util.*;
class Point {
    int x, y, cost;
    Point(int x, int y, int cost){
        this.x = x;
        this.y = y;
        this.cost = cost;
    }
}
class Solution {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    boolean[][] visited;
    int n, m;
    public int solution(int[][] maps) {
        n = maps.length; // 행
        m = maps[0].length; // 열
        visited = new boolean[n][m];
        return bfs(0,0,maps);
        
    }
    
    public int bfs(int x, int y, int[][] maps){        
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y, 1));
        visited[x][y] = true;
                
        while(!q.isEmpty()){
            Point tmp = q.poll();
            if(tmp.x == n -1 && tmp.y == m -1) return tmp.cost;
            
            for(int i=0; i<4; i++){
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if(nx>=0 && ny >= 0 && nx<n && ny <m){
                    if(maps[nx][ny] == 1 && !visited[nx][ny]){
                        visited[nx][ny] = true;
                        q.offer(new Point(nx, ny, tmp.cost + 1));
                    }
                }
            }
        }
        
        return -1;
       
    }
    
}