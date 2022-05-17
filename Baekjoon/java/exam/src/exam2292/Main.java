package exam2292;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
   /**
    * It's a function that takes in a number and returns the number of rooms in the building that has
    * that number of rooms
    */
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = Integer.parseInt(br.readLine());
        int cnt = 1;
        int roomNumber = 2;
        
        if(i > 1){
            while (roomNumber <= i) {
                roomNumber = roomNumber + (6 * cnt);
                cnt++;
            }
            
        }

        bw.write(cnt+"");

        bw.flush();
        bw.close();   
        
        br.close();
    }

}
