package exam10828;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception{
        Stack<String> st = new Stack<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(reader.readLine());
        
        for(int i=0;i<tc;i++){
            String str = reader.readLine();
            String[] str_arr = str.split(" ");

            if(str_arr[0].equals("push")){
                st.push(str_arr[1]);
            }else if(str_arr[0].equals("pop")){
                try {
                    System.out.println(st.peek());
                    st.pop();
                } catch (EmptyStackException e) {
                    //TODO: handle exception
                    System.out.println("-1");
                }

            }else if(str_arr[0].equals("size")){
                System.out.println(st.size());
            }else if(str_arr[0].equals("empty")){
                if(st.empty()) System.out.println("1");
                else System.out.println("0");
            }else if(str_arr[0].equals("top")){
                try {
                    System.out.println(st.peek());
                } catch (EmptyStackException e) {
                    //TODO: handle exception
                    System.out.println("-1");
                }
                
            }
        }

        reader.close();
    }

}
