import java.io.*;
import java.util.*;

//Divisibilty rule
//https://math.hmc.edu/funfacts/divisibility-by-eleven/#:~:text=Here%20an%20easy%20way%20to,2%20%E2%80%93%208%20%3D%20%2D11.


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int N = Integer.parseInt(br.readLine().trim());
         String[] arr_A = br.readLine().split(" ");
         int[] A = new int[N];
         for(int i_A=0; i_A<arr_A.length; i_A++)
         {
         	A[i_A] = Integer.parseInt(arr_A[i_A]);
         }

         String out_ = solve(A);
         System.out.println(out_);

         wr.close();
         br.close();
    }
    static String solve(int[] A){
        // Write your code here
        int length = A.length/2;
        boolean flag1 =true;
        int finalN=0;
        for(int i=0; i<length; i++){
            String s = String.valueOf(A[i]);
            char[] ch = s.toCharArray();
            if(flag1){
                finalN+=Integer.parseInt(String.valueOf(ch[0]));
                flag1=false;
            }else{
                finalN-=Integer.parseInt(String.valueOf(ch[0]));
                flag1=true;
            }
        }
        
        for(int i=length; i<A.length; i++){
            int k = A[i];
            int rem =A[i]%10;
            if(flag1){
                finalN+=rem;
                flag1=false;
            }else{
                finalN-=rem;
                flag1=true;
            }
        }

        if(finalN<0){
            finalN*=(-1);
        }

        if(finalN%11==0){
            return "OUI";
        }

        return "NON";

        
       
    
    }
}
