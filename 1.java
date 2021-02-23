


import java.io.*;

class A {

	static void textToNumberBinary(String str) {
	
	char[] out = new char[8];
	int[] arr = new int[9];

	arr[0] = 0;
	arr[8] = str.length();
	int k = 1,cnt=0;
	char ch[] = str.toCharArray();


	for(int i = 0; i<ch.length; i++){

		if(ch[i] == ' '){
			cnt++;
		}
	}
	if(cnt != 7){
		System.out.println("");
		return;
	}
	else{

		for(int i = 0; i<ch.length; i++){

			if(ch[i] == ' '){
				arr[k] = i;
				k++;
			}
		}
	}

	for(int i = 0,j=0; j<8; i++,j++){

		if(str.substring(arr[i],arr[i+1]).equals("zero")){
			ch[j] = '0';
			arr[i+1]++;
		
		}else if(str.substring(arr[i],arr[i+1]).equals("one")){
			ch[j] = '1';
			arr[i+1]++;
		}else{
			System.out.println("");
			return;
		}
	}


	for(int i = 0; i<8; i++)
		System.out.print(ch[i]);

	System.out.println();
}	


public static void main(String[] args){

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
//	String str = br.readLine();
	textToNumberBinary("zero one zero one zero one one zero");

	}
}
