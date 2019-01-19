#include<iostream>
using namespace std;

int main(){
	
	int a[4],b[4],emma,gonar;
	
	emma = 0;
	gonar = 0;
	for(int i = 0;i < 4;i++) {
	cin>>a[i];
	gonar += a[i];
		}
		
		for(int i = 0;i < 4;i++){
			cin>>b[i];
			emma += b[i];
		}
		
		if(emma > gonar) {
			cout<<"Emma"<<endl;
		}
		else if (emma < gonar){
			cout<<"Gunnar"<<endl;
		}
		else{
		cout<<"Tie"<<endl;}

	
return 0;
}