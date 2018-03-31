#ifndef TRAPEZIO_HPP
#define TRAPEZIO_HPP

#include "triangulo.hpp"

class Trapezio: public Triangulo
{
private:
    float baseMaior;
public:
    Trapezio(void);
    void setBaseMaior(float baseMaior);
    float getBaseMaior(void);
    float perimetro(float base, float baseMaior, float lado1, float lado2);
    float area(float base, float baseMaior, float altura);
};

#endif
