#include<stdio.h>
int main ()
{
	double a,b;
	scanf("%lf%lf",&a,&b);
	printf("%.0lf",((a+b)+(a-b)+(b+a)+(b-a)));
	return 0;
}