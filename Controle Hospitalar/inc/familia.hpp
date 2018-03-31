#ifndef FAMILIA_HPP
#define FAMILIA_HPP

#include "pessoa.hpp"
#include "paciente.hpp"

class Familia: public Pessoa, Paciente
{
private:
    string parentesco;
    string telefone;
    Paciente umPaciente;

public:
    Familia(void);
    void setParentesco(string parentesco);
    string getParentesco(void);
    void setTelefone(string telefone);
    string getTelefone(void);
    void setUmPaciente(Paciente umPaciente);
    Paciente getUmPaciente(void);
};

#endif
