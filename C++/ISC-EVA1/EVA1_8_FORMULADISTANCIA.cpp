/******************************************************************************

Nidia González Morales 18550676

*******************************************************************************/
#include <iostream>
#include <sstream>
#include <string>
#include <cstdlib>
#include <cmath>

using namespace std;

int main(){
   cout<<"Velocidad inicial"<<endl;
   double vI;
   cin>> vI;
   
   cout<<"Velocidad final"<<endl;
   double vF;
   cin>> vF;
   
   cout<<"Tiempo"<<endl;
   double t;
   cin>> t;
   
   double d;
   
   d = ((vI+vF)/2)*t;
   
   cout<<"Tu distancia es "<<d<<endl;
   
   return 0;
}
