#include <stdio.h>
#include <math.h>

int main(){
	int t;
	double a, s;
	scanf("%d",&t);
	
		for(int i = 0;i < t;i++) {
		scanf("%lf",&a);
		scanf("%lf",&s);
		printf("%.2lf\n", (sqrt(s*s - 4*a)/2));
	}
}