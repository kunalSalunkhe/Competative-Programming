

import java.io.*;

class Ana {

	public static void main(String[] args)throws IOException{

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	
	String str = "Justin Bieber"; 
	String[] s = {"injures", "ebb", "it"};

	int strlen = 0;
	for(int i = 0; i<str.length(); i++){
		if(str.charAt(i) != ' ')
			strlen++;
	}

	char ch[] = str.toCharArray();
//	System.out.println(strlen);

	int cnt = 0,cnt2 = 0,strarr=0;	
		
	for(int i = 0; i<s.length; i++){

		cnt2 =0;
		for(int j = 0; j<s[i].length(); j++){

			strarr++;
			for(int k = 0; k<str.length(); k++){

				if(s[i].charAt(j) == str.charAt(k)){

					cnt2++;
					ch[k] = '*';
					break;
				}
			}

		}

			System.out.println(cnt2);
			if(cnt2 == s[i].length())
				cnt++;		
	}
	
//	System.out.println(strarr);
	System.out.println(cnt);
	System.out.println(s.length);

	if(strlen == strarr){

		if(cnt == s.length)
			System.out.println("true");
		else
			System.out.println("false");
	}else
		System.out.println("false");
    
}}
