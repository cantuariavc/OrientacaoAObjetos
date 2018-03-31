#ifndef FORMASGEOMETRICAS_HPP
#define FORMASGEOMETRICAS_HPP

#include <iostream>
#include <cstdlib>

using namespace std;

class FormasGeometricas
{
private:
    float base, altura, lado, raio, pi, lado1, lado2;

public:
    FormasGeometricas(void);
    void setBase(float base);
    float getBase(void);
    void setAltura(float altura);
    float getAltura(void);
    void setLado(float lado);
    float getLado(void);
    virtual void perimetro(void);
    virtual void area(void);
    void setRaio(float raio);
    float getRaio(void);
    float getPi(void);
    void setLado1(float lado1);
    float getLado1(void);
    void setLado2(float lado2);
    float getLado2(void);
};

#endif
