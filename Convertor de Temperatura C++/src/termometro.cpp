#include "termometro.hpp"

Termometro::Termometro()
{
    temperatura = 0.0;
}

void Termometro::setTemperatura(float temperatura)
{
    this->temperatura = temperatura;
}

float Termometro::getTemperatura(void)
{
    return temperatura;
}

void Termometro::converte(void)
{

}
