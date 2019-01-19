#include<stdio.h>
#include<math.h>

int main(){
	
	double pi=atan(1)*4,acum,res;
         int nc,p,r,h;
	
      scanf("%d",&nc);
       for(int i=0; i<nc; i++){
	scanf("%d",&p);
		for(int j=0; j<p; j++){
		scanf("%d",&r);
		        scanf("%d",&h);
			
				//r2=(((pow(s/3,2)*p)
				acum+=((pow(r,2)*pi)*h);  //h" es el peso
			}
                printf("%.2lf\n",acum);
		acum=0;
	}
	return 0;
}