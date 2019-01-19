#include <stdio.h>
#include <stdlib.h>

int main(){
	
	long long N,M,T,Q,Tto,Qto;
	
	while((scanf("%lld%lld", &N, &M))!=EOF){ 
	
		T = N*(N-1)/2;
		Q = M*(M-1)/2;
		
		Tto = ((T*M + Q*N));
		Qto = ((T*Q));
		
		printf("Triangles: %lld\n" , Tto);
		printf("Quadrilaterals: %lld" , Qto);
		printf("\n\n");
	}
	
	return 0;
}