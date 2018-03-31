#ifndef CELSIUS_HPP
#define CELSIUS_HPP

#include "termometro.hpp"

class Celsius: public Termometro
{
public:
    void converte(float celsius);
};

#endif
