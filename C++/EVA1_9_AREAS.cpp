

//Nidia Gonzalez Morales 18550676

#include <iostream>
#include <sstream>
#include <string>
#include <cstdlib>
#include <cmath>

using namespace std;

string toString (double);
int toInt(string);
double toDouble(string); 

int main() {
    cout <<"Ingresa el valor de la base mayor"<<endl;
    double bM;
    cin>>bM;
    
    cout<<"Ingrese el valor de la base menor"<<endl;
    double bMe;
    cin>>bMe;
    
    cout<<"ingrese el valor de la altura"<<endl;
    double h;
    cin>>h;
    
    double aT;
    aT=((bM + bMe)/2) * h;
    cout<<"El área del trapecio es  "<<aT<<endl;
    return 0;
}