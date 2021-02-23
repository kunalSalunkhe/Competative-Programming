#include<stdio.h>
#include<stdlib.h>
#include<string.h>

char *morse[55] = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", ".-.-.-", "--..--", "..--..", ".----.", "-.-.--", "-..-.", "-.--.", "-.--.-", ".-...", "---...", "-.-.-.", "-...-", ".-.-.", "-....-", "..--.-", ".-..-.", "...-..-", ".--.-.", "...---..."};  
char *ascii[55] = {"A",  "B",    "C",    "D",   "E", "F",    "G",   "H",    "I",  "J",    "K",   "L",    "M",  "N",  "O",   "P",    "Q",    "R",   "S",   "T", "U",   "V",    "W",   "X",    "Y",    "Z",    "0",     "1",     "2",     "3",     "4",     "5",     "6",     "7",     "8",     "9",     ".",      ",",      "?",      "'",      "!",      "/",     "(",     ")",      "&",     ":",      ";",      "=",     "+",     "-",      "_",      "\"",     "$",       "@",      "SOS"};


  char crr[40];
        int j = 0,k = 0,g=0;
        char str[4];
 //      int len = strlen(morse_code);

char *decode_morse(char morse_code[]){

 	int len = strlen(morse_code);
 
      for(int i = 0; i<len; ){

		if((morse_code[i] == ' ') && (morse_code[i+1] == ' ')){
			i+=2;
			crr[g] = ' ';
			g++;
			continue;
		}

		j = i;
		k = 0;

		while(morse_code[j] != ' '){
			

			str[k] = morse_code[j];
			j++;
			k++;
		}
	
		str[k] = '\0';
		
		for(int h = 0; h<55; h++){

			if(strcmp(morse[h],str))
				continue;	
			
				crr[g] = ascii[h][0];
				g++;
				break;
			}

		i = j+1;		
     	}
	crr[g] = '\0';
	
	return crr;
}
int main(){

	char ch[20];

//	scanf("%[^\n]",ch);

	char *strr = decode_morse(".... . -.--   .--- ..- -.. .");
//	char *strr = decode_morse(ch);
	puts(strr);
	return 0;
}

