#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main(int argc, char*argv[]){
	char buf[8];
	int length = strlen(argv[1]);
	
	if(length>8){
		printf("Overflow occurred!");
		exit(0);
	}
    else{
		strcpy(buf,argv[1]);
		printf("%s\n",buf);
	}
	return 0;
}
