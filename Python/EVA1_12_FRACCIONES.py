print("Numerador")
n1 = int(input())
print("Denominador")
d1 = int(input())
print("Numerador dos")
n2 = int(input())
print("Denominador dos")
d2 = int(input())
print("La fracción número uno es " ,n1 , "/" , d1)
print("La fracción número dos es " , n2 , "/" , d2)
if d1 == d2:
    sF1 = n1 + n2
    print("La suma de la fracción es " , sF1 , "/" , d1)
else:
    smF1 = d1 * d2
    smnF1 = n1 * d2
    smdF1 = n2 * d1
    sF1 = smnF1 + smdF1
    print("La suma es " , sF1 , "/" , smF1)
if d1 == d2:
    sF1 = n1 - n2
    print("La resta de la fracción es " , sF1 , "/" , d1)
else:
    smF1 = d1 * d2
    smnF1 = n1 * d2
    smdF1 = n2 * d1
    sF1 = smnF1 - smdF1
    print("La resta es " , sF1 , "/" , smF1)
mF = n1 * n2
mF1 = d1 * d2
print("La multiplicación de la fracción es " , mF , "/" , mF1)
dfA = n1 * d2
dfB = d1 * n2
print("La división de la fracción es " , dfA , "/" , dfB)
