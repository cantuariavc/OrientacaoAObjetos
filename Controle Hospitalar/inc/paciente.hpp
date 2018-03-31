#ifndef PACIENTE_HPP
#define PACIENTE_HPP

#include "pessoa.hpp"
#include "medico.hpp"

class Paciente: public Pessoa, Medico
{
private:
    string doenca;
    Medico umMedico;

public:
    Paciente(void);
    void setDoenca(string doenca);
    string getDoenca(void);
    void setUmMedico(Medico umMedico);
    Medico getUmMedico(void);
};

#endif
