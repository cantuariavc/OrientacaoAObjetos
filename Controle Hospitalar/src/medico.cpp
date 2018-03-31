#include "medico.hpp"

Medico::Medico(void)
{
    especializacao = "Especialização";
    umPaciente.doenca = "Doença";
}

void Medico::setEspecializacao(string especializacao)
{
    this->especializacao = especializacao;
}
string Medico::getEspecializacao(void)
{
    return especializacao;
}

void Medico::setUmPaciente(Paciente umPaciente)
{
    this->umPaciente = umPaciente;
}
Paciente Medico::getUmPaciente(void)
{
    return umPaciente;
}
