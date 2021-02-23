


import java.io.*;

class Robot {

	public static void main(String[] args)throws IOException{

	int x,y;

//	int north,east,west,south;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	int north = Integer.parseInt(br.readLine());
	int east = Integer.parseInt(br.readLine());
	int south = Integer.parseInt(br.readLine());
	int west = Integer.parseInt(br.readLine());

		x = east - west;
		y = north - south;

	System.out.println(x+ "," +y);
	}
}
			
