package exam1157;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine().toUpperCase();
        int[] alpha = new int[26];

        // 65 ~ 90
        for(int i = 0;i < str.length();i++){
            alpha[str.charAt(i) - 65] ++;
        }

        int max = -1;
		char ch = '?';
		for (int i = 0;i < alpha.length;i++) {
 
			if (alpha[i] > max) {
				max = alpha[i];
				ch = (char) (i + 65);
			} 
			else if (alpha[i] == max) {
				ch = '?';
			}
		}

        System.out.print(ch);

        reader.close();
    }

}
