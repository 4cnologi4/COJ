#include<stdio.h>
int main ()
{
	int W;
	scanf("%d",&W);
	if (W==2)printf("NO");
	else if(W!=2){
		if(W%2==0){
			printf("YES");
		}
		else{
			printf("NO");
		}
	} 
	return 0;
}