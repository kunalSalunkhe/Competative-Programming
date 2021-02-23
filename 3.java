

import java.io.*;

class Challenge {

	public static boolean largestSwap(int num) {

		int n = num;
		int b=0,rem;
		while(n!=0){
				rem = n%10;
				b = b*10 + rem;
				n=n/10;
			}
		System.out.println(b);
		if(num>b)
				return true;
		else
				return false;
}
	public static void main(String[] args)throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int a = Integer.parseInt(br.readLine());
		
		System.out.println(largestSwap(a));
	}
}

