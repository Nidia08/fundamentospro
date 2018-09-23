

//Nidia Gonzalez Morales 18550676

#include <iostream>
#include <sstream>
#include <string>
#include <cstdlib>
#include <cmath>

using namespace std;

string toString (double);
int toInt (string);
double toDouble (string);

int main() {
    cout<< "Ingresa el primer valor de x"<<endl;
    double x1;
    cin>>x1;
    
    cout<<"Ingresa el segundo valor de x"<<endl;
    double x2;
    cin>>x2;
    
    cout<< "Ingresa el primer valor de y"<<endl;
    double y1;
    cin>>y1;
    
    cout<<"Ingresa el segundo valor de y"<<endl;
    double y2;
    cin>>y2;
    
    double p;
    
    p = (double) (y2-y1)/(x2-x1);
    
    cout<<"La pendiente es "<<p<<endl;
    return 0;
}

