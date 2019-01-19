	#include <iostream>
	#include <algorithm>
	using namespace std;
	
	int main() {
		
		int arg[4];
		cin>>arg[1];
		while(arg[1]!=0){
			cin>>arg[2]>>arg[3];
			
			sort(arg+1,arg+4);
			
			if(arg[1]*arg[1]+arg[2]*arg[2]==arg[3]*arg[3])
				cout<<"right"<<endl;
			else
			    cout<<"wrong"<<endl;
				cin>>arg[1];	
			    
	 }
}