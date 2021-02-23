
	
import java.io.*;

class CharMapping {

	public static void main(String[] args)throws IOException{

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String str1 = "abcd";
	String str2 = "abb";
	String str3 = "babbcb";
	String str4 = "hmmmmm";

	String str = br.readLine(); 

	char ch[] = str.toCharArray();

	int[] arr = new int[ch.length];

	int flag = 0, flag2 = 0, cnt = 0;

	for(int i = 0; i<ch.length; i++){

		flag = 0;

		for(int j = 0; j<i; j++){

			if(ch[i] == ch[j]){

				arr[i] = arr[j];
				flag = 1;
			}
		}

		cnt = 0;

		if(flag == 0){

			for(int j = 0; j<i; j++){
				flag2 = 0; 
					for(int k = 0; k<j; k++){

						if(ch[j] == ch[k]){
							flag2 = 1;
							break;
						}
					}
				if(flag2 == 0)
				cnt++;
			}
		   
							
			arr[i] = cnt;
		}
	}

	for(int i = 0; i<arr.length; i++)
		System.out.println(arr[i]+ " ");
	
	}
}

	

