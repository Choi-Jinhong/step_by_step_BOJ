import java.io.*;
import java.util.StringTokenizer;

public class b_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int z = 0; z < T; z++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < r; j++)
                    bw.write(s.charAt(i));
            }
            bw.write("\n");
        }
        bw.flush();
    }
}