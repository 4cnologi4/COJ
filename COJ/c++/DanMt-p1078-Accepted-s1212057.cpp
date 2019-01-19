#include<iostream>
using namespace std;

int main()
{
   long long i,T,k,D,suma,N;
cin >>T;
for (i=1;i<=T;i++){
cin>>N;
suma = 0;
 for (k = 1;k<=N;k++){
cin>>D;
suma= suma+D;
}
if(suma%N==0)
   cout<<"YES"<<endl;
else
  cout<<"NO"<<endl;
   }
}