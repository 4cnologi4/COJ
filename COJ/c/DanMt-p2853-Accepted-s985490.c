#include<stdio.h>
#include<math.h>


int main (){
	double L;
	
	//scanf("%lf",)
	while (scanf("%lf",&L)) {
            
            if(L == 0){
            	break;
			}
            
            double apo = sqrt(2 * ((L / 2) * (L / 2)));
            double lado = 2 * apo - L;
            double per = 8 * lado;
            double ar = (per * (L / 2)) / 2;
            
			printf("%.3lf\n",ar);
	}
return 0;
}