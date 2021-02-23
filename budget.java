
import java.io.*;
class Budget {

	String name;
	int age;
	int budget;

	static int getBudget(Budget[] b,int n){

		int sum = 0;
		for(int i = 0; i<n; i++){
			sum += b[i].budget;
		}

		return sum;
	}
}
class S {

	public static void main(String[] args)throws IOException{

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	int n = Integer.parseInt(br.readLine());

	Budget b[] = new Budget[n];
	//b[0].name = br.readLine();
	//b[0].age = Integer.parseInt(br.readLine());
	//b[0].budget = Integer.parseInt(br.readLine());

	for(int i = 0; i<n; i++){

	        b[i] = new Budget();
		b[i].name = br.readLine();
		b[i].age = Integer.parseInt(br.readLine());
		b[i].budget = Integer.parseInt(br.readLine());
	}

	System.out.println(Budget.getBudget(b,n));
	}
}
		
