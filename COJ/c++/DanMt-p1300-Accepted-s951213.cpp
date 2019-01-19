#include<iostream>
#include<set>
using namespace std;
 
int main (){

 	set<int> Miset;
	 int N,i;
	  for(i = 1 ;i <=10 ; i++){
	   cin>>N;
	   Miset.insert(N%42);
	   
    }
   cout<<Miset.size();
	
}