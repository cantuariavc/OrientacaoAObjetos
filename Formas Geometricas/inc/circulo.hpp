#ifndef CIRCULO_HPP
#define CIRCULO_HPP

#include "formasGeometricas.hpp"

class Circulo: public FormasGeometricas
{
public:
    float perimetro(float pi, float raio);
    float area(float pi, float raio);
};

#endif
