#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;

int main(){
	int t;
	double a, s;
	cin >> t;
	while(t--){
		cin >> a >> s;
		printf("%.2lf\n", (sqrt(s*s - 4*a)/2));
	}

}