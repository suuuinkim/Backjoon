import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());

        // int lt = 0;

        int lt =  0;
        int rt = 0;
        int answer = 0;
        int[] cnt = new int[100001];
        while(rt<n){
            while(rt < n && cnt[arr[rt]] +1 <=m){
                cnt[arr[rt]]++;
                rt++;
            }
            int len = rt - lt;
            answer = Math.max(answer , len);
            cnt[arr[lt]]--;
            lt++;
        }

        System.out.println(answer);
    }
}
