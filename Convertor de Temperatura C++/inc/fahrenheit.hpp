#ifndef FAHRENHEIT_HPP
#define FAHRENHEIT_HPP

#include "termometro.hpp"

class Fahrenheit: public Termometro
{
public:
    void converte(float fahrenheit);
};

#endif
