#ifndef TRIANGULO_HPP
#define TRIANGULO_HPP

#include "formasGeometricas.hpp"

class Triangulo: public FormasGeometricas
{
private:
    float lado1, lado2;
public:
    Triangulo(void);
    void setLado1(float lado1);
    float getLado1(void);
    void setLado2(float lado2);
    float getLado2(void);
    float perimetro(float base, float lado);
    float area(float base, float altura);
};

#endif
