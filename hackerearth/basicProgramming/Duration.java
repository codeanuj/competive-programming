class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(br.readLine());
        
        for(int i=0; i<cases; i++){
            String str = br.readLine();
            String time[] = str.split(" ");
            int startTime = Integer.parseInt(time[0])*60 + Integer.parseInt(time[1]);
            int endTime = Integer.parseInt(time[2])*60 + Integer.parseInt(time[3]);
            
            int duration = Math.abs(endTime-startTime);

            System.out.println((duration/60) +" "+ (duration%60));

        }
    }
}
