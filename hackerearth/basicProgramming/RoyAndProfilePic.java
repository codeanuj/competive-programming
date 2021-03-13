import java.io.BufferedReader;
import java.io.InputStreamReader;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int L = Integer.parseInt(br.readLine());
       int noOfPhotos = Integer.parseInt(br.readLine());

       while(noOfPhotos!=0){
            String s= br.readLine();
	           String str[]=s.split("  ");
	           int H = Integer.parseInt(str[0]);
	           int W = Integer.parseInt(str[1]);

           if(L>W || L>H){
               System.out.println("UPLOAD ANOTHER");
               continue;
           }
           if(L==W && H ==W){
               System.out.println("ACCEPTED");
           }else if(W>L || H>L){
               System.out.println("CROP IT");
           }
        noOfPhotos--;
       } 
    }
}
