package exam11720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        int sum = 0;
        for(int i=0;i<n;i++) sum += Integer.parseInt( String.valueOf(s.charAt(i)) );

        sc.close();
        System.out.println(sum);

    }

       
}


