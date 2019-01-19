#include<iostream>
#include<cstdio>

using namespace std;

int main (){


	int t;
	double n,sum,pro;
	cin>>t;
	for(int i = 0;i < t;i++){
		cin>>n;
		sum+= n;
    }
    pro = sum / t;
    printf("%.2lf",pro);
    
	return 0;
}