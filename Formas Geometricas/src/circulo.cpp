#include "circulo.hpp"

float Circulo::area(float pi, float raio)
{
    return pi * raio * raio;
}

float Circulo::perimetro(float pi, float raio)
{
    return 2 * pi * raio;
}
