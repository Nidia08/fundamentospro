//Nidia Gonzalez Morales 18550676

#include <iostream>
#include <sstream>
#include <string>
#include <cstdlib>
#include <cmath>

using namespace std;

// Headers
string toString (double);
int toInt (string);
double toDouble (string);

int main() {
    cout << "Introduce tu nombre" << endl;
    string nom;
    cin >> nom;
    
    cout<<"Introduce tu edad"<<endl;
    int edad;
    cin>>edad;
    
    int anio;
    anio = 2018-edad;
    
    cout<<"Tu nombre es "<<nom<<" Tu fecha de nacimiento "<<anio<<endl;
    
   
}


