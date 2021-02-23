


#include<stdio.h>

void main(){

	char *ch = "there";

	char s[5];

	s[0] = (int)(ch[0] - 96);

	printf("%c\n",s[0]);
}

