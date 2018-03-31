#ifndef KELVIN_HPP
#define KELVIN_HPP

#include "termometro.hpp"

class Kelvin: public Termometro
{
public:
    void converte(float kelvin);
};

#endif
