#include "formasGeometricas.hpp"

FormasGeometricas::FormasGeometricas(void)
{
    base = 0.0;
    altura = 0.0;
    lado = 0.0;
    raio = 0.0;
    pi = 3.1415926535;
    lado1 = 0.0;
    lado2 = 0.0;
}

void FormasGeometricas::setBase(float base)
{
    this->base = base;
}

float FormasGeometricas::getBase(void)
{
    return base;
}

void FormasGeometricas::setAltura(float altura)
{
    this->altura = altura;
}

float FormasGeometricas::getAltura(void)
{
    return altura;
}

void FormasGeometricas::setLado(float lado)
{
    this->lado = lado;
}

float FormasGeometricas::getLado(void)
{
    return lado;
}

void FormasGeometricas::perimetro(void)
{}

void FormasGeometricas::area(void)
{}

void FormasGeometricas::setRaio(float raio)
{
    this->raio = raio;
}

float FormasGeometricas::getRaio(void)
{
    return raio;
}

float FormasGeometricas::getPi(void)
{
    return pi;
}

void FormasGeometricas::setLado1(float lado1)
{
    this->lado1 = lado1;
}

float FormasGeometricas::getLado1(void)
{
    return lado1;
}

void FormasGeometricas::setLado2(float lado2)
{
    this->lado2 = lado2;
}

float FormasGeometricas::getLado2(void)
{
    return lado2;
}
