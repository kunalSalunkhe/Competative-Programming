


class Tic {

	public static void main(String[] args){

	int flag1 = 0,flag2 = 0,signal = 0;

	String[][] s = new String[][]{{"X","O","O"},
				      {"X","O","X"},
				      {"X","O","O"}};

	int horiX,vertiX,horiO,vertiO,crossX,rcrossX,crossO,rcrossO;

			crossX = 0;rcrossX = 0;crossO = 0;rcrossO = 0;

	for(int i = 0; i<3; i++){

		horiX = 0;horiO = 0;flag1=0;flag2=0;

		for(int j = 0; j<3; j++){

			if(s[i][j].equals("X"))
				horiX++;
			else 
				horiO++;

			vertiX = 0;vertiO = 0;

			for(int k = 0; k<3; k++){

				if(s[k][j].equals("X"))
					vertiX++;
				else
					vertiO++;
			}

				if(vertiX == 3){
					flag1 = 1;
					break;
				}else if(vertiO == 3){
					flag2 = 1;
					break;
				}

			//crossX = 0,rcrossX = 0,crossO = 0, rcrossO = 0;
		
			if(i == j){

				if(s[i][j].equals("X"))
					crossX++;
				else 
					crossO++;
			}
			if(i == 2-j){

				if(s[i][j].equals("X"))
					rcrossX++;
				else
					rcrossO++;
			}
		}

		if(horiX == 3){
			System.out.println("X");
			signal++;
			break;
		}
		else if(horiO == 3){
			signal++;
			System.out.println("O");
			break;
		}
		if(flag1 == 1){
			signal++;
			System.out.println("X");
			break;
		}
		else if(flag2 == 1){
			signal++;
			System.out.println("O");
			break;
		}
	}

		if(crossX == 3){
			signal++;
			System.out.println("X");
		}
		else if(crossO == 3){
			signal++;
			System.out.println("O");
		}	

		
		if(rcrossX == 3){
			signal++;
			System.out.println("X");
		}
			
		else if(rcrossO == 3){
			signal++;
			System.out.println("O");
		}


	if(signal == 0)
		System.out.println("DRAW");
	else if(signal == 1)
		System.out.println("Congrtas");
	else
		System.out.println("DRAW");
	
	}
}	

	



			
			
