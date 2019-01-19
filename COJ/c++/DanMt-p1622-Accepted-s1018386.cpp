#include <iostream>

using namespace std;

int main()
{   int n,arg[102],sum,con;
    while(cin>>n){
     for(int i=0;i<n;i++){
        cin>>arg[i];
      }
      sum=0;
      for(int i=0;i<n;i++)sum+=arg[i];
      con=0;
      for(int i=0;i<n;i++){
         if((sum-arg[i])%2==0) con++;
      }
      cout<<con<<endl;
    }
    
    return 0;
}