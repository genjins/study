import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        String a = sc.next().toUpperCase();
        String[] a_arr = a.split("");
        sc.close();

        for(String s:a_arr){
           System.out.println(s +" : " + a.chars().filter(c -> c ==  s.charAt(0)).count() );
        }
    }
}

