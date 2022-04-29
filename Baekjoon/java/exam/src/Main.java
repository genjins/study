import java.util.Scanner;

public class Main {
   public static void main(String[] args) throws Exception{
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       sc.close();
       String s = "";

       for(int i=0;i<x;i++){
           for(int j=0;j<x-i-1;j++) System.out.print(" ");
           s +="*";
           System.out.println(s);
        }
    } 
}
