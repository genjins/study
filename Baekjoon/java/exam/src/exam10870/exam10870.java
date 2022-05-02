package exam10870;
import java.util.Scanner;

public class exam10870 {
    public static void main(String[] args) {

        // 사용자 입력 값
        int in = 0;

        // 사용자 입력값
        Scanner s = new Scanner(System.in);
        System.out.print("피보나치 수를 입력하세요 : ");
        try {
            in = s.nextInt();
            s.close();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("숫자를 입력하세요.");
            return;
        }

        if(in > 45 || in < 0){
            System.out.println("45 이하 자연수를 입력하세요.");
            return;
        }

        int[] r = new int[in+1];
        r[0] = 0;
        r[1] = 1;

        for(int i = 2;i < in + 1;i++){
            r[i] = r[i-2] + r[i-1];
        }

        System.out.println(in + "번째 피보나치 수 : " + r[in-1]);

    }
}
