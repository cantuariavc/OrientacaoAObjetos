#ifndef QUADRADO_HPP
#define QUADRADO_HPP

#include "formasGeometricas.hpp"

class Quadrado: public FormasGeometricas
{
public:
    float perimetro(float lado);
    float area(float lado);
};

#endif
