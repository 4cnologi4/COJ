#include<stdio.h>
int main ()
{
	int tonayan,yaestandeperros;
	scanf("%d",&tonayan);
		if (tonayan>0){
			yaestandeperros=((tonayan*tonayan)+tonayan)/2;
			}
		else {
		       yaestandeperros=((((tonayan*tonayan)+((-1)*tonayan))/2)-1)*(-1);
			}
		printf("%d",yaestandeperros);
	return 0;
}