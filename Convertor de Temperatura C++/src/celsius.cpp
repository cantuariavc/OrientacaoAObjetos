#include "celsius.hpp"

void Celsius::converte(float celsius)
{
    cout << "Temperatura em Celsius: " << setiosflags (ios::fixed) << setprecision (1) << celsius << " ºC" << endl;
    cout << "Temperatura em Fahrenheit: " << setiosflags (ios::fixed) << setprecision (1) << celsius * 9 / 5 + 32 << " ºF" << endl;
    cout << "Temperatura em Kelvin: " << setiosflags (ios::fixed) << setprecision (1) << celsius + 273 << " K" << endl;
}
