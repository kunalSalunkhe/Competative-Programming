


import java.io.*;
 class Challenge {

        public static int minSwap(String s1, String s2){

        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();

        int cnt = 0;

        if(ch1.length != ch2.length){
                System.out.print("cannot swap");
                return -1;
        }

        int nZeroch1 = 0, nOnech1 = 0;
        int nZeroch2 = 0, nOnech2 = 0;

        for(int i = 0; i<ch1.length; i++){

                if(ch1[i] == '0')
                        nZeroch1++;
                else
                        nOnech1++;

                if(ch2[i] == '0')
                        nZeroch2++;
                else
                        nOnech2++;
        }

        if((nZeroch1 != nZeroch2) || (nOnech1 != nOnech2)){
                System.out.print("string is not valid");
                return -1;
        }

        for(int i = 0; i<ch1.length; i++){

                if(ch1[i] != ch2[i]){
                        cnt++;
                }
  }

        return (cnt/2);

        }

        public static void main(String[] args)throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
				String s1 = br.readLine(); 
        String s2 = br.readLine();

        System.out.println(minSwap(s1,s2));
        }
}


