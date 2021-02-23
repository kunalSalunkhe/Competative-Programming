

#include<stdio.h>

int *pint(int a, int b){

     int c = a+b;
        int *d = &c;

        return d;
}

void main(){

        int *ptr = pint(34,23);

        printf("%d\n",*ptr);
}


