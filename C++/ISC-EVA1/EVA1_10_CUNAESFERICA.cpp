

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
    cout<< "Ingresa el radio"<<endl;
    double r;
    cin>>r;
    
    cout<<"Ingresa los grados"<<endl;
    double g;
    cin>>g;
    
    double vT;
    
    vT = (double) 4/3 * (3.1416* pow(r,3)/360)*g;
    
    cout<<"El volumen de la cuna esferica es "<<vT<<endl;
    return 0;
}

