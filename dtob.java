

import java.io.*;
class Binary {

	static String dTOb()throws IOException{
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



	int arr[] = new int[]{256,128,64,32,16,8,4,2,1};

	char ch[] = new char[]{'0','0','0','0','0','0','0','0','0'};

	int a = Integer.parseInt(br.readLine());
	int b = a;
	int sum = 0;

	while(sum != b){

		for(int i = 0; i<8; i++){

			if((arr[i] > a) && (arr[i+1] <= a)){

				sum = sum + arr[i+1];

				a = a - arr[i+1];

				ch[i+1] = '1';

				if(a == 0){
					sum += 0;
					ch[8] = '0';
				}
				if(a == 1){

					sum+=1;	
					ch[8] = '1';
				}

			break;
			}
		}
	}

	String s = String.valueOf(ch);

	for(int i = 0; i<8; i++){
		if(ch[i] == '1'){
			s = s.substring(i);
			break;
		}
	}
	return s;

/*
	int flag = 0;
	for(int i = 0; i<9; i++){
		
		if(ch[i] == '1'){
			for(int j = i; j<9; j++)
				System.out.print(ch[j]);

			flag = 1;
		}

		if(flag == 1)
			break;
	}

	System.out.println();
	}*/
}
	public static void main(String[] args)throws IOException{

	System.out.println(dTOb());

	}
}

