//Nidia Gonzalez Morales 18550676

#include <iostream>
#include <sstream>
#include <string>
#include <cstdlib>
#include <cmath>

using namespace std;

class Ejemplo{
    private:
        int val;
    public:
        Ejemplo(int);
};

Ejemplo::Ejemplo(int _val){
    val = _val;
}

int main() {
   Ejemplo p1 = Ejemplo(10);
}




