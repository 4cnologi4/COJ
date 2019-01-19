#include<stdio.h>

int main(){
	
	int a[4],b[4],emma,gonar;
	
	emma = 0;
	gonar = 0;
	for(int i = 0;i < 4;i++) {
	scanf("%d",&a[i]);
	gonar += a[i];
		}
		
		for(int i = 0;i < 4;i++){
			scanf("%d",&b[i]);
			emma += b[i];
		}
		
		if(emma > gonar) {
			printf("Emma\n");
		}
		else if (emma < gonar){
			printf("Gunnar\n");
		}
		else{
		printf("Tie\n");
		}

	
return 0;
}