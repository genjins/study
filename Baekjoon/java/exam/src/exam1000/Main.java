package exam1000;

import java.util.Scanner;

public class Main {
  /**
   * The function takes two integers as input, adds them together, and prints the result to the console
   */
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       int a, b;

       a = scan.nextInt();
       b = scan.nextInt();

       scan.close();
       
       System.out.println(a+b);


    } 
}
