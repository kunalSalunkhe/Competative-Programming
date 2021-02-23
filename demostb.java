

import java.io.*;
 class Challenge {
	public static String binary(int decimal) {
		
		        int arr[] = new int[]{256,128,64,32,16,8,4,2,1};

				String s = "00000000";
        char ch[] = new char[]{'0','0','0','0','0','0','0','0','0'};

        int b = decimal;
        int sum = 0;

        while(sum != decimal){

                for(int i = 0; i<9; i++){

                        if((arr[i] > b) && (arr[i+1] <= b)){

                                sum = sum + arr[i+1];

                                b = b - arr[i+1];

                                s.charAt(i+1) = '1';

                                if(b == 0){
                                        sum += 0;
                                        s.charAt(8) = '0';
                                }
                                if(b == 1){

                                        sum+=1;
                                        s.charAt(8) = '1';
                                }

                        break;
                        }
                }
        }
		s = s.subString(s.indexOf('1'));
		return s;
}
	public static void main(String[] args)throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		System.out.println(binary(a));
	}
}
