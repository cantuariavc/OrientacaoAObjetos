#include "triangulo.hpp"

Triangulo::Triangulo(void)
{
    lado1 = 0.0;
    lado2 = 0.0;
}

void Triangulo::setLado1(float lado1)
{
    this->lado1 = lado1;
}
float Triangulo::getLado1(void)
{
    return lado1;
}

void Triangulo::setLado2(float lado2)
{
    this->lado2 = lado2;
}
float Triangulo::getLado2(void)
{
    return lado2;
}

float Triangulo::perimetro(float base, float lado)
{
    return base + lado * 2;
}

float Triangulo::area(float base, float altura)
{
    return base * altura / 2;
}
