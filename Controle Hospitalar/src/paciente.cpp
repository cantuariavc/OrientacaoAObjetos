#include "paciente.hpp"

Paciente::Paciente(void)
{
    doenca = "Doenca";
    umMedico.especializacao = "Especialização";
}

void Paciente::setDoenca(string doenca)
{
    this->doenca = doenca;
}
string Paciente::getDoenca(void)
{
    return doenca;
}

void Paciente::setUmMedico(Medico umMedico)
{
    this->umMedico = umMedico;
}
Medico Paciente::getUmMedico(void)
{
    return umMedico;
}
