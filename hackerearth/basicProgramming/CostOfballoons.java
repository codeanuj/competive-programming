import java.io.BufferedReader;
import java.io.InputStreamReader;
class TestClass {
    public static void main(String args[] ) throws Exception {


    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testcases = Integer.parseInt(br.readLine());
    for(int i=0; i<testcases; i++){
        int firstProblem =0;
        int secondProblem =0;
         String colorsPrice = br.readLine();
         String[] price = colorsPrice.split(" ");
         int greenPrice = Integer.parseInt(price[0]);
         int purplePrice = Integer.parseInt(price[1]);
         int participants = Integer.parseInt(br.readLine());

        for(int j=0; j<participants;j++){
            String problems = br.readLine();
            String[] answerSheet = problems.split(" ");
            if(Integer.parseInt(answerSheet[0])==1){
                firstProblem++;
            }
            if(Integer.parseInt(answerSheet[1])==1){
                secondProblem++;
            }
        }

        int x = firstProblem*greenPrice + secondProblem*purplePrice;
        int y = firstProblem*purplePrice + secondProblem*greenPrice;
        System.out.println(Math.min(x,y));

    } 

   }
}
