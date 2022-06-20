package exam5622;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = st.countTokens();
        if(cnt > 1 && cnt < 16){
            while (st.hasMoreTokens()) {
                bw.write("" + st.nextToken());
                
            }

        }else{
            bw.write("" + "입력 범위를 벗어났습니다.");
        }
        bw.flush();
        bw.close();   
        
        br.close();
    }

}
