#include "fahrenheit.hpp"

void Fahrenheit::converte(float fahrenheit)
{
    cout << "Temperatura em Fahrenheit: " << setiosflags (ios::fixed) << setprecision (1) << fahrenheit << " ºF" << endl;
    cout << "Temperatura em Celsius: " << setiosflags (ios::fixed) << setprecision (1) << (fahrenheit - 32) * 5 / 9 << " ºC" << endl;
    cout << "Temperatura em Kelvin: " << setiosflags (ios::fixed) << setprecision (1) << (fahrenheit - 32) * 5 / 9 + 273 << " K" << endl;
}
