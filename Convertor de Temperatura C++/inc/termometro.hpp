#ifndef TERMOMETRO_HPP
#define TERMOMETRO_HPP

#include <iostream>
#include <iomanip>
#include <cstdlib>

using namespace std;

class Termometro
{
private:
    float temperatura;

public:
    Termometro(void);
    void setTemperatura(float temperatura);
    float getTemperatura(void);
    virtual void converte(void);
};

#endif
