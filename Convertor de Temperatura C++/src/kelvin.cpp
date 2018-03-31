#include "kelvin.hpp"

void Kelvin::converte(float kelvin)
{
    cout << "Temperatura em Kelvin: " << setiosflags (ios::fixed) << setprecision (1) << kelvin << " K" << endl;
    cout << "Temperatura em Celsius: " << setiosflags (ios::fixed) << setprecision (1) << kelvin - 273 << " ºC" << endl;
    cout << "Temperatura em Fahrenheit: " << setiosflags (ios::fixed) << setprecision (1) << (kelvin - 273) * 9 / 5 + 32 << " ºF" << endl;
}
