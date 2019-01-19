#include <iostream>
using namespace std;

int main (){
	
	int nmont,pos;
	float mont, max;
	
	cin>>nmont;
	max = 0;
	for(int i = 1; i <=nmont;i++){
		cin>>mont;
		if(mont >= max){
			max = mont;
			pos = i;
		}
	}
	cout<<pos;
	
	return 0;
}