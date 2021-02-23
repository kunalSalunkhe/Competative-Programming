

#include<stdio.h>

int a = 10;

int *n = &a;


void main(){

//	int a = 10;

//	int *n = &a;

	*(n+1) = 12;

	printf("%d\n",*n);
	printf("%d\n",*(n+1));
}


