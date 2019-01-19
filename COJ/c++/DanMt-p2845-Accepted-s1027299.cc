#include<iostream>
using namespace std;	
	
int main (){
    
     double x,y;
 	cin>>x>>y;
	while (true) {
            if (x == 0 && y == 0) {
                cout<<"AXIS"<<endl;
                break;
            }

            if (x > 0 && y > 0) {
                cout<<"Q1"<<endl;
            } else if (x < 0 && y > 0) {
                cout<<"Q2"<<endl;
            } else if (x < 0 && y < 0) {
                cout<<"Q3"<<endl;
            } else if (x > 0 && y < 0) {
                cout<<"Q4"<<endl;
            }
            
            if(x == 0 || y == 0){
                cout<<"AXIS"<<endl;
            }

            cin>>x;
            cin>>y;
        }
return 0;
}