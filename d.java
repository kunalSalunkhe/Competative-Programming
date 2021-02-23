



import java.io.*;
 class Challenge {
	public static String binary(int decimal) {
		
		        int arr[] = new int[]{256,128,64,32,16,8,4,2,1};

				String s = new String();
        char ch[] = new char[]{'0','0','0','0','0','0','0','0','0'};

        int b = decimal;
        int sum = 0;

        while(sum != decimal){

                for(int i = 0; i<9; i++){

                        if((arr[i] > b) && (arr[i+1] <= b)){

                                sum = sum + arr[i+1];

                                b = b - arr[i+1];

                                ch[i+1] = '1';

                                if(b == 0){
                                        sum += 0;
                                        ch[8] = '0';
                                }
                                if(b == 1){

                                        sum+=1;
                                        ch[8] = '1';
                                }

                        break;
                        }
                }
        }
		int flag = 0;
		for(int i = 0; i<9; i++){
			  if(ch[i] == '1'){
						for(int j = i; j<9; j++)
								s.concat(ch[j]);
					
						flag = 1;
				}
			if(flag == 1)
					break;
		}
		
		return s;
}
	public static void main(String[] args)throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		System.out.println(binary(a));
	}
}
