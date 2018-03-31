#include "retangulo.hpp"

float Retangulo::perimetro(float base, float altura)
{
    return base * 2 + altura * 2;
}

float Retangulo::area(float base, float altura)
{
    return base * altura;
}
