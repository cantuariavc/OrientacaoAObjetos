#include "trapezio.hpp"

Trapezio::Trapezio(void)
{
    baseMaior = 0.0;
}

void Trapezio::setBaseMaior(float baseMaior)
{
    this->baseMaior = baseMaior;
}
float Trapezio::getBaseMaior(void)
{
    return baseMaior;
}

float Trapezio::perimetro(float base, float baseMaior, float lado1, float lado2)
{
    return base + baseMaior + lado1 + lado2;
}

float Trapezio::area(float base, float baseMaior, float altura)
{
    return (baseMaior + base) * altura / 2;
}
