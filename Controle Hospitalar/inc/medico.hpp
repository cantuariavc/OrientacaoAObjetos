#ifndef MEDICO_HPP
#define MEDICO_HPP

#include "pessoa.hpp"
#include "paciente.hpp"

class Medico: public Pessoa, Paciente
{
private:
    string especializacao;
    Paciente umPaciente;

public:
    Medico(void);
    void setEspecializacao(string especializacao);
    string getEspecializacao(void);
    void setUmPaciente(Paciente umPaciente);
    Paciente getUmPaciente(void);
};


#endif
