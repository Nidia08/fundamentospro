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
    cout << "Numerador" << endl;
    int n1;
    
    cin >> n1;
    cout << "Denominador" << endl;
    int d1;
    
    cin >> d1;
    cout << "Numerador dos" << endl;
    int n2;
    
    cin >> n2;
    cout << "Denominador dos" << endl;
    int d2;
    
    cin >> d2;
    cout << "La fracción número uno es " << n1 << "/" << d1 << endl;
    cout << "La fracción número dos es " << n2 << "/" << d2 << endl;
    if (d1 == d2) {
        int sF1;
        
        sF1 = n1 + n2;
        cout << "La suma de la fracción es " << sF1 << "/" << d1 << endl;
    } else {
        int smF1;
        
        smF1 = d1 * d2;
        int smnF1;
        
        smnF1 = n1 * d2;
        int smdF1;
        
        smdF1 = n2 * d1;
        int sF1;
        
        sF1 = smnF1 + smdF1;
        cout << "La suma es " << sF1 << "/" << smF1 << endl;
    }
    if (d1 == d2) {
        int sF1;
        
        sF1 = n1 - n2;
        cout << "La resta de la fracción es " << sF1 << "/" << d1 << endl;
    } else {
        int smF1;
        
        smF1 = d1 * d2;
        int smnF1;
        
        smnF1 = n1 * d2;
        int smdF1;
        
        smdF1 = n2 * d1;
        int sF1;
        
        sF1 = smnF1 - smdF1;
        cout << "La resta es " << sF1 << "/" << smF1 << endl;
    }
    int mF;
    
    mF = n1 * n2;
    int mF1;
    
    mF1 = d1 * d2;
    cout << "La multiplicación de la fracción es " << mF << "/" << mF1 << endl;
    int dfA;
    
    dfA = n1 * d2;
    int dfB;
    
    dfB = d1 * n2;
    cout << "La división de la fracción es " << dfA << "/" << dfB << endl;
    return 0;
}

// The following implements type conversion functions.
string toString (double value) { //int also
    stringstream temp;
    temp << value;
    return temp.str();
}

int toInt (string text) {
    return atoi(text.c_str());
}

double toDouble (string text) {
    return atof(text.c_str());
}

