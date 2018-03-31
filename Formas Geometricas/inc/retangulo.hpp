#ifndef RETANGULO_HPP
#define RETANGULO_HPP

#include "formasGeometricas.hpp"

class Retangulo: public FormasGeometricas
{
public:
    float perimetro(float base, float altura);
    float area(float base, float altura);
};

#endif
